package durithon.duri;import android.content.Intent;import android.os.Bundle;import android.support.v7.app.AppCompatActivity;import android.view.View;import android.widget.Button;import android.widget.RelativeLayout;public class HomeActivity extends AppCompatActivity {    RelativeLayout walk_btn;    RelativeLayout record_btn;    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_home);        walk_btn = (RelativeLayout) findViewById(R.id.walk_btn);        walk_btn.setOnClickListener(new View.OnClickListener() {            @Override            public void onClick(View view) {                startActivity(new Intent(HomeActivity.this, MapActivity.class));            }        });        record_btn = (RelativeLayout) findViewById(R.id.record_btn);        record_btn.setOnClickListener(new View.OnClickListener() {            @Override            public void onClick(View view) {                startActivity(new Intent(HomeActivity.this, RecordActivity.class));            }        });    }}