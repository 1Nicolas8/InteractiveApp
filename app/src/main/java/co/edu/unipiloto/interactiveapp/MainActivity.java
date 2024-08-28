package co.edu.unipiloto.interactiveapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends Activity {
    private tipoProyecto tipo = new tipoProyecto();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindProject(View view) {
        TextView proyectos = (TextView) findViewById(R.id.projects);
        Spinner tipoProyectos = (Spinner) findViewById(R.id.project_types);
        String tipoProyecto = String.valueOf(tipoProyectos.getSelectedItem());

        List<String> listaProyectos = tipo.getProyectos(tipoProyecto);
        StringBuilder proyectoString = new StringBuilder();
        for (String project : listaProyectos) {
            proyectoString.append(project).append('\n');
        }
        proyectos.setText(proyectoString);
    }
}