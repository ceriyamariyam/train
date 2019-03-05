package com.internal.administrator.traintiming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InsertdetActivity extends AppCompatActivity {
    EditText tno,tname,spoint,epoint,dtime,etime;
    Button ins,vi,sa,up,del;
    TextView t1,t2,t3,t4,t5,t6;
String s1,s2,s3,s4,s5,s6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertdet);
        tno=(EditText)findViewById(R.id.trno);
        tname=(EditText)findViewById(R.id.trname);
        spoint=(EditText)findViewById(R.id.strpoint);
        epoint=(EditText)findViewById(R.id.enpoint);
        dtime=(EditText)findViewById(R.id.deptime);
        etime =(EditText)findViewById(R.id.endtime);
        ins=(Button)findViewById(R.id.insert);
        vi=(Button)findViewById(R.id.view);
        sa=(Button)findViewById(R.id.save);
        up=(Button)findViewById(R.id.update);
        del=(Button)findViewById(R.id.delete);
        t1=(TextView) findViewById(R.id.tt1);
        t2=(TextView) findViewById(R.id.tt2);
        t3=(TextView) findViewById(R.id.tt3);
        t4=(TextView) findViewById(R.id.tt4);
        t5=(TextView) findViewById(R.id.tt5);
        t6=(TextView) findViewById(R.id.tt6);


        ins.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
      s1=tno.getText().toString();
        s2=tname.getText().toString();
        s3=spoint.getText().toString();
        s4=epoint.getText().toString();
        s5=dtime.getText().toString();
        s6=etime.getText().toString();

        t1.setVisibility(View.VISIBLE);
        tno.setVisibility(View.VISIBLE);

        t2.setVisibility(View.VISIBLE);
        tname.setVisibility(View.VISIBLE);

        t3.setVisibility(View.VISIBLE);
        spoint.setVisibility(View.VISIBLE);

        t4.setVisibility(View.VISIBLE);
        epoint.setVisibility(View.VISIBLE);

        t5.setVisibility(View.VISIBLE);
        dtime.setVisibility(View.VISIBLE);

        t6.setVisibility(View.VISIBLE);
        etime.setVisibility(View.VISIBLE);
        sa.setVisibility(View.VISIBLE);


    }
});

    }
}
