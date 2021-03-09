package id.codeplus.fragmentluasbangundatar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SegitigaFragment extends Fragment {

    EditText editTextAlas, editTextTinggi;
    Button buttonHitungSegitiga;
    TextView textViewHasilSegitiga;
    double hasil;

    public SegitigaFragment() {
        // Required empty public constructor
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putDouble("SEGITIGA", hasil);
        super.onSaveInstanceState(outState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_segitiga, container, false);

        editTextAlas = (EditText) view.findViewById(R.id.etAlas);
        editTextTinggi = (EditText) view.findViewById(R.id.etTinggi);
        buttonHitungSegitiga = (Button) view.findViewById(R.id.bHitungSegitiga);
        textViewHasilSegitiga = (TextView) view.findViewById(R.id.tvHasilSegitiga);

        if (savedInstanceState != null){
            hasil = savedInstanceState.getDouble("SEGITIGA");
            textViewHasilSegitiga.setText(String.valueOf(hasil));
        }

        buttonHitungSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double alas = Double.parseDouble(editTextAlas.getText().toString());
                double tinggi = Double.parseDouble(editTextTinggi.getText().toString());
                hasil = (alas * tinggi) / 2;
                textViewHasilSegitiga.setText(String.valueOf(hasil));
            }
        });

        return view;
    }

}
