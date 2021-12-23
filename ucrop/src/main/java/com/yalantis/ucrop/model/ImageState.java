package com.yalantis.ucrop.model;

import android.graphics.RectF;

/**
 * Created by Oleksii Shliama [https://github.com/shliama] on 6/21/16.
 */
public class ImageState {

    private RectF mCropRect;
    private RectF mCurrentImageRect;

    private float mCurrentScale, mCurrentAngle;
    private boolean mFlipHorizontally;

    public ImageState(RectF cropRect, RectF currentImageRect, float currentScale, float currentAngle, boolean flipHorizontally) {
        mCropRect = cropRect;
        mCurrentImageRect = currentImageRect;
        mCurrentScale = currentScale;
        mCurrentAngle = currentAngle;
        mFlipHorizontally = flipHorizontally;
    }

    public RectF getCropRect() {
        return mCropRect;
    }

    public RectF getCurrentImageRect() {
        return mCurrentImageRect;
    }

    public float getCurrentScale() {
        return mCurrentScale;
    }

    public float getCurrentAngle() {
        return mCurrentAngle;
    }

    public boolean isFlipHorizontally() {
        return mFlipHorizontally;
    }
}
