package com.ayah.common.ui.bookmarklist.view.wrapper;

import android.widget.FrameLayout;
import p030c9.f;
import p051e9.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_BookmarkListWrapper extends FrameLayout implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f13706r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13707s;

    @Override // p051e9.b
    public final Object c() {
        if (this.f13706r == null) {
            this.f13706r = new f(this);
        }
        return this.f13706r.c();
    }
}
