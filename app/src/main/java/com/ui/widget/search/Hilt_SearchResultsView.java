package com.ayah.ui.widget.search;

import android.widget.FrameLayout;
import p030c9.f;
import p051e9.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_SearchResultsView extends FrameLayout implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f13958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13959s;

    @Override // p051e9.b
    public final Object c() {
        if (this.f13958r == null) {
            this.f13958r = new f(this);
        }
        return this.f13958r.c();
    }
}
