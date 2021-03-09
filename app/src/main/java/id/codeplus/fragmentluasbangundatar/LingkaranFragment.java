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
public class LingkaranFragment extends Fragment {

    EditText editTextJari;
    Button buttonHitung;
    TextView textViewHasilLingkaran;
    static final double PI = 3.14;
    double hasil = 0.0;

    public LingkaranFragment() {
        // Required empty public constructor
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putDouble("LINGKARAN", hasil);
        super.onSaveInstanceState(outState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lingkaran, container, false);

        editTextJari = (EditText) view.findViewById(R.id.etJari);
        buttonHitung = (Button) view.findViewById(R.id.bHitung);
        textViewHasilLingkaran = (TextView) view.findViewById(R.id.tvHasilLingkaran);

        if(savedInstanceState != null){
            hasil = savedInstanceState.getDouble("LINGKARAN");
            textViewHasilLingkaran.setText(String.valueOf(hasil));
        }

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double jari = Double.parseDouble(editTextJari.getText().toString());
                hasil = PI * jari * jari;
                textViewHasilLingkaran.setText(String.valueOf(hasil));
            }
        });

        return view;
    }

}
