package com.ayah.ui.widget.search;

import F9.n;
import I1.C0;
import I1.D0;
import I1.E0;
import I1.F0;
import O8.c;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.SearchView;
import p181s2.A;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class SearchViewWrapper extends SearchView {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final Context f13969A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f13970B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewWrapper(Context context) {
        super(context);
        j.e(context, "context");
        this.f13969A0 = context;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        Activity activityE;
        n d1;
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || this.f13970B0 <= 0) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        if (keyEvent.getAction() == 1 && (activityE = A.e(this.f13969A0)) != null) {
            Window window = activityE.getWindow();
            c cVar = new c((View) this);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 35) {
                d1 = new F0(window, cVar);
            } else if (i10 >= 30) {
                d1 = new E0(window, cVar);
            } else {
                d1 = i10 >= 26 ? new D0(window, cVar) : new C0(window, cVar);
            }
            d1.E(8);
        }
        return true;
    }

    public final int getImeInsets$app_release() {
        return this.f13970B0;
    }

    public final void setImeInsets$app_release(int i10) {
        this.f13970B0 = i10;
    }
}
