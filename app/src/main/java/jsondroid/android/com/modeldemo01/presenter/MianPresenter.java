package jsondroid.android.com.modeldemo01.presenter;

import android.content.Context;
import android.util.Log;

import jsondroid.android.com.modeldemo01.base.BasePresenter;

/**
 * Created by wenbaohe on 2018/6/15.
 * 业务逻辑层
 */

public class MianPresenter extends BasePresenter<IContract.MainView> implements IContract.IMainIm {
    protected Context mContext;

    public MianPresenter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void oncreat() {
        Log.e("测试数据---", "oncreat");
    }

    @Override
    public void onresume() {
        Log.e("测试数据---", "onresume");
    }

    @Override
    public void onstart() {
        Log.e("测试数据---", "onstart");
    }

    @Override
    public void onstop() {
        Log.e("测试数据---", "onstop");
    }

    @Override
    public void onpus() {
        Log.e("测试数据---", "onpus");
    }

    @Override
    public void ondestry() {
        Log.e("测试数据---", "ondestry");
    }

    @Override
    public void getData( int requst) {
        view.onRefresh(requst);
    }
}

