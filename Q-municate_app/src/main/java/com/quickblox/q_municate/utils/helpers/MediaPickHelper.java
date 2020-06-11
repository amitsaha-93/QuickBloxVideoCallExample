package com.quickblox.q_municate.utils.helpers;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import com.quickblox.q_municate.ui.fragments.mediapicker.MediaPickHelperFragment;
import com.quickblox.q_municate.ui.fragments.mediapicker.MediaSourcePickDialogFragment;

public class MediaPickHelper {

    public void pickAnMedia(Fragment fragment, int requestCode) {
        MediaPickHelperFragment mediaPickHelperFragment = MediaPickHelperFragment
                .start(fragment, requestCode);
        showMediaSourcePickerDialog(fragment.getChildFragmentManager(), mediaPickHelperFragment);
    }

    public void pickAnMedia(FragmentActivity activity, int requestCode) {
        MediaPickHelperFragment mediaPickHelperFragment = MediaPickHelperFragment
                .start(activity, requestCode);
        showMediaSourcePickerDialog(activity.getSupportFragmentManager(), mediaPickHelperFragment);
    }

    private void showMediaSourcePickerDialog(FragmentManager fm, MediaPickHelperFragment fragment) {
        MediaSourcePickDialogFragment.show(fm,fragment);
    }
}