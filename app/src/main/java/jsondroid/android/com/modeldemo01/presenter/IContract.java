package jsondroid.android.com.modeldemo01.presenter;

import jsondroid.android.com.modeldemo01.base.IBaseView;

/**
 * Created by wenbaohe on 2018/6/15.
 * 同意管理接口方式
 */

public interface IContract {
    public interface IModelPresenter{
        public void onResphone(int resdata);
    }
    public interface IMainIm {

        public void oncreat();

        public void onresume();

        public void onstart();

        public void onstop();

        public void onpus();

        public void ondestry();

        public void getData(int requst);
    }

    public interface MainView extends IBaseView {
        public void onRefresh(int modeldata);
    }
}
