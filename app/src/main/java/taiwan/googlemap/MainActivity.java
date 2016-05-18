package taiwan.googlemap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.buttonV2)
    Button buttonV2;
    @Bind(R.id.buttonV3)
    Button buttonV3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getApplication();
        getApplicationContext();
    }

    @OnClick({R.id.buttonV2, R.id.buttonV3})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonV2:
                startActivity(new Intent(this, CircleDemoActivity.class));
                break;
            case R.id.buttonV3:
                startActivity(new Intent(this, MapV3.class));
                break;
        }
    }
}
