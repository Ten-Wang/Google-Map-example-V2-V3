package taiwan.googlemap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by TenWang on 2016/5/13.
 */
public class MapV2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_v2);
        ButterKnife.bind(this);
    }
}
