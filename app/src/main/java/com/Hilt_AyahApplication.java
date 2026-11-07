package com.ayah;

import Aa.a;
import J3.x;
import L3.e;
import L3.g;
import Z0.B;
import android.app.Application;
import android.content.Context;
import p030c9.f;
import p035d3.InterfaceC0925g;
import p035d3.u;
import p051e9.b;
import p074h0.i;
import p085i0.n;
import p144o3.h;
import p174r3.l;
import p208v3.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_AyahApplication extends Application implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13618r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f13619s = new f(new B(7, this));

    @Override // p051e9.b
    public final Object c() {
        return this.f13619s.c();
    }

    @Override // android.app.Application
    public void onCreate() {
        if (!this.f13618r) {
            this.f13618r = true;
            AyahApplication ayahApplication = (AyahApplication) this;
            u uVar = (u) ((InterfaceC0925g) this.f13619s.c());
            ayahApplication.f13604t = (c) uVar.f15663e.get();
            ayahApplication.f13605u = (g) uVar.f15664f.get();
            ayahApplication.f13606v = (e) uVar.g.get();
            Context context = uVar.f15659a.f1940a;
            ayahApplication.f13607w = new i(context, (D3.c) uVar.f15665h.get());
            p174r3.c cVar = (p174r3.c) uVar.f15667k.get();
            D3.c cVar2 = (D3.c) uVar.f15665h.get();
            l lVar = (l) uVar.f15674r.get();
            x xVar = (x) uVar.f15666i.get();
            j.e(cVar, "bookModel");
            j.e(cVar2, "bookSource");
            j.e(lVar, "bookRepository");
            j.e(xVar, "preferencesStore");
            a aVar = new a();
            aVar.f554r = cVar;
            aVar.f555s = cVar2;
            aVar.f556t = lVar;
            aVar.f557u = xVar;
            ayahApplication.f13608x = aVar;
            ayahApplication.f13609y = (x) uVar.f15666i.get();
            ayahApplication.f13610z = new n(context, (h) uVar.f15675s.get());
        }
        super.onCreate();
    }
}
