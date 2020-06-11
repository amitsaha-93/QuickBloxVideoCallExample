package com.quickblox.q_municate.utils.bridges;

import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

public interface ActionBarBridge {

    void initActionBar();

    void setActionBarTitle(String title);

    void setActionBarTitle(@StringRes int title);

    void setActionBarSubtitle(String subtitle);

    void setActionBarSubtitle(@StringRes int subtitle);

    void setActionBarIcon(Drawable icon);

    void setActionBarIcon(@DrawableRes int icon);

    void setActionBarUpButtonEnabled(boolean enabled);
}