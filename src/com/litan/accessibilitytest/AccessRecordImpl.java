package com.litan.accessibilitytest;

import android.graphics.Rect;

public class AccessRecordImpl implements AccessRecord {
	int mChildDepth;
    int mEventType;
    String mViewResName;
    CharSequence mText;
    CharSequence mPkgName;
    int mWindowIndex;
    Rect mBoundsInScreen;
    CharSequence mDes;
    @Override
    public String getViewResName() {
        return mViewResName;
    }

    @Override
    public CharSequence getText() {
        return mText;
    }

    @Override
    public CharSequence getPkgName() {
        return mPkgName;
    }

    @Override
    public int getEventType() {
        return mEventType;
    }

    @Override
    public int getWindowIndex() {
        return mWindowIndex;
    }

    @Override
    public Rect getBoundsInScreen() {
        return mBoundsInScreen;
    }

	@Override
	public int getChildDepth() {
		return mChildDepth;
	}

    @Override
    public CharSequence getContentDescription() {
        return mDes;
    }
}
