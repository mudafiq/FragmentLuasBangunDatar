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
public class PersegiFragment extends Fragment {

    int hasil;
    EditText editTextSisi;
    Button buttonHitung;
    TextView textViewHasil;

    public PersegiFragment() {
        // Required empty public constructor
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("PERSEGI", hasil);
        super.onSaveInstanceState(outState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_persegi, container, false);
        editTextSisi = (EditText) view.findViewById(R.id.etSisi);
        buttonHitung = (Button) view.findViewById(R.id.bHitungPersegi);
        textViewHasil = (TextView) view.findViewById(R.id.tvHasilPersegi);

        if(savedInstanceState != null){
            hasil = savedInstanceState.getInt("PERSEGI");
            textViewHasil.setText(String.valueOf(hasil));
        }

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sisi = Integer.parseInt(editTextSisi.getText().toString());
                hasil = sisi * sisi;
                textViewHasil.setText(String.valueOf(hasil));
            }
        });

        return view;
    }

}
