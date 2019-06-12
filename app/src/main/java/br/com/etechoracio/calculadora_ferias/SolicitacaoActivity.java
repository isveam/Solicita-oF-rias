package br.com.etechoracio.calculadora_ferias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.Arrays;

import br.com.etechoracio.calculadora_ferias.Enum.Dias;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioSim;
    private RadioButton radioNao;
    private Button btnData;
    private Spinner spnQtde;
    private EditText editFim;
    private Button btnRegistrar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitacao);

        radioNao = findViewById(R.id.radioNao);
        radioSim = findViewById(R.id.radioSim);
        btnData = findViewById(R.id.btnData);
        spnQtde = findViewById(R.id.spnQtde);
        editFim = findViewById(R.id.editFim);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        spnQtde.setAdapter(getAdapter(Dias.class));
    }

    private <T extends Enum<T>> ArrayAdapter getAdapter(Class<T> clazz) {
        return new ArrayAdapter<T>(this,
                R.layout.support_simple_spinner_dropdown_item,
                clazz.getEnumConstants());
    }

    public ArrayAdapter<Integer> onRadioClick(View v){

      if( v.getId()== R.id.radioSim){

          //spnQtde.setAdapter(get);
          return new ArrayAdapter<Integer>(this,R.layout.support_simple_spinner_dropdown_item,Arrays.asList(20,30));


        }else{
            //popular dias
            }
    }
       // private ArrayAdapter getAbonoSim(){
       //     return new ArrayAdapter<Integer>(...,...,Arrays.asList(20,30));

        private void calcularDaraFinal(int dias){
        //java 7 add days
            //pegar data do botão e converter para date
            //calcular data mais dias
            //exibe no campo data final
        }

        }

