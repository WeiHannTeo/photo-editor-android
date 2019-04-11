package com.ahmedadeltito.photoeditorsdk;


import android.graphics.Typeface;
/**
 * Created by Ahmed Adel on 02/06/2017.
 */

public interface OnPhotoEditorSDKListener {

    void onEditTextChangeListener(String text, int colorCode, Typeface fontCode, int lineHeight);

    void onAddViewListener(ViewType viewType, int numberOfAddedViews);

    void onRemoveViewListener(int numberOfAddedViews);

    void onStartViewChangeListener(ViewType viewType);

    void onStopViewChangeListener(ViewType viewType);
}
