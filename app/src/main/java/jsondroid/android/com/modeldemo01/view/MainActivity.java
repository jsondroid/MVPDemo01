package jsondroid.android.com.modeldemo01.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import jsondroid.android.com.modeldemo01.R;
import jsondroid.android.com.modeldemo01.presenter.IContract;
import jsondroid.android.com.modeldemo01.presenter.MianPresenter;

public class MainActivity extends BaseActivity<IContract.MainView, MianPresenter> implements IContract.MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.oncreat();
    }

    @Override
    protected MianPresenter initPresenter() {
        return new MianPresenter(this);
    }


    public void clickBtn(View view) {
        /**请求数据*/
        presenter.getData(39585);
    }

    /**返回数据*/
    @Override
    public void onRefresh(int modeldata) {
        Log.e("测试数据---", ""+modeldata);
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.onstart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.onstop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.ondestry();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.onpus();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onresume();
    }
}
