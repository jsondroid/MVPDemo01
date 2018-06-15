package jsondroid.android.com.modeldemo01.base;


/**
 * Created by wenbaohe on 2018/6/15.
 * 基类 P层 ，用于处理和UI View层的关联
 */

public class BasePresenter<V extends IBaseView> {
    public V view;

    public void bindView(V view) {
        this.view = view;
    }

    public void unBindView() {
        this.view = null;
    }

    public boolean checkBindView() {
        return view == null;
    }
}
