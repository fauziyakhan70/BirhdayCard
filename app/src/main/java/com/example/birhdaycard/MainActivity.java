package com.example.birhdaycard;

import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
       EditText ename;
       Button mbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ename=(EditText)findViewById(R.id.name);
        mbutton=(Button)findViewById(R.id.create);
        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=ename.getText().toString();
                if (name==null&&name.equals("")){
                    Toast.makeText(MainActivity.this,"please enter the name",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent i=new Intent(MainActivity.this,birthday.class);
                    i.putExtra("birthday name",name);
                    startActivity(i);
                }
            }
        });
    }
}