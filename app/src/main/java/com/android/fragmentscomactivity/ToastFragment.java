package com.android.fragmentscomactivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ToastFragment extends Fragment {

    private TextView txtMensagem;
    private Button btnEnviar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate( R.layout.fragment_toast, container, false );

        txtMensagem = view.findViewById( R.id.txtMensagem );
        btnEnviar = view.findViewById( R.id.btnEnviar );

        btnEnviar.setOnClickListener( new EscutadorBotao() );

        return view;
    }

    private class EscutadorBotao implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(getContext(), txtMensagem.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }

}
