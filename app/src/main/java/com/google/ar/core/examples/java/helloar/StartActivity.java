package com.google.ar.core.examples.java.helloar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.ar.core.examples.java.helloar.R;

public class StartActivity extends AppCompatActivity implements View.OnClickListener{

    Button eiffel,sol,room,house;

    private static final String eiffelPath = "Eiffel/eiffel.obj";
    private static float eiffelScale = 0.01f;

    private static final String libertyPath = "LibertyStatue/LibertStatue.obj";
    private static final float libertyScale = 1f;

    private static final String roomPath = "interior/interior.obj";
    private static final float roomScale = .001f;

    private static final String farmHousePath = "farmhouse/farmhouse_obj.obj";
    private static float farmScale = .02f;

    public static final String path  = "Path";
    public static final String scaleFactor  = "ScaleFactor";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        sol = (Button)findViewById(R.id.sol);
        room = (Button)findViewById(R.id.room);
        eiffel = (Button)findViewById(R.id.eiffel);
        house = (Button)findViewById(R.id.house);

        sol.setOnClickListener(this);
        room.setOnClickListener(this);
        house.setOnClickListener(this);
        eiffel.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(StartActivity.this,HelloArActivity.class);
        switch (view.getId())
        {
            case R.id.sol:
                intent.putExtra(path,libertyPath);
                intent.putExtra(scaleFactor,libertyScale);
                break;

            case R.id.room:
                intent.putExtra(path,roomPath);
                intent.putExtra(scaleFactor,roomScale);
                break;

            case R.id.house:
                intent.putExtra(path,farmHousePath);
                intent.putExtra(scaleFactor,farmScale);
                break;

            case R.id.eiffel:
                intent.putExtra(path,eiffelPath);
                intent.putExtra(scaleFactor,eiffelScale);
                break;
        }
        startActivity(intent);
    }
}
