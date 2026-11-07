package com.ayah;

import Aa.a;
import J3.x;
import K9.AbstractC0405x;
import K9.H;
import L3.e;
import L3.f;
import L3.g;
import N9.AbstractC0419l;
import N9.C0424q;
import P9.d;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import com.ayah.dao.realm.factory.RealmUtils;
import io.realm.Realm;
import p035d3.C0922d;
import p035d3.C0923e;
import p035d3.C0924f;
import p074h0.i;
import p085i0.n;
import p208v3.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class AyahApplication extends Hilt_AyahApplication {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final d f13603A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f13604t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g f13605u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e f13606v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i f13607w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a f13608x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x f13609y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public n f13610z;

    public AyahApplication() {
        R9.e eVar = H.f5322a;
        this.f13603A = AbstractC0405x.b(R9.d.f7436t);
    }

    @Override // com.ayah.Hilt_AyahApplication, android.app.Application
    public final void onCreate() {
        super.onCreate();
        C0922d c0922d = new C0922d(this, null, 1);
        d dVar = this.f13603A;
        AbstractC0405x.x(dVar, null, c0922d, 3);
        Realm.init(this);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        int i10 = defaultSharedPreferences.getInt("preferencesRevision", 0);
        if (i10 != 22) {
            SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
            if (i10 == 0) {
                editorEdit.putBoolean("shouldShowOnboarding", true).apply();
            }
            if (i10 < 13) {
                RealmUtils.INSTANCE.clearRealmsForV13(this);
            }
            if (i10 < 15) {
                try {
                    AbstractC0405x.x(dVar, null, new C0922d(this, null, 6), 3);
                } catch (Throwable th) {
                    p110k9.a.b(th);
                }
            }
            if (i10 < 18) {
                AbstractC0405x.x(dVar, null, new C0922d(this, null, 2), 3);
            }
            if (i10 < 22) {
                AbstractC0405x.x(dVar, null, new C0922d(this, null, 3), 3);
            }
            AbstractC0405x.x(dVar, null, new C0923e(this, defaultSharedPreferences, (p150o9.c) null), 3);
            editorEdit.putInt("preferencesRevision", 22).apply();
        }
        if (i10 == 22 && defaultSharedPreferences.getBoolean("shouldCleanupOldFiles", false)) {
            AbstractC0405x.x(dVar, null, new C0923e(defaultSharedPreferences, this, (p150o9.c) null), 3);
        }
        p171r0.d.c(((I3.a) AbstractC0405x.C(p150o9.i.f20380r, new C0922d(this, null, 5))).f3821r);
        x xVar = this.f13609y;
        if (xVar == null) {
            j.k("preferencesStore");
            throw null;
        }
        AbstractC0419l.u(new C0424q(xVar.f4309c, new C0924f(2, null), 2), dVar);
        g gVar = this.f13605u;
        if (gVar == null) {
            j.k("reminderChangeReactor");
            throw null;
        }
        c cVar = this.f13604t;
        if (cVar == null) {
            j.k("notificationModel");
            throw null;
        }
        AbstractC0419l.u(new C4.g(new C4.g(cVar.f23329a.f4265f, cVar, 25), new f(gVar, null, 0), 7), gVar.f5512b);
        e eVar = this.f13606v;
        if (eVar == null) {
            j.k("alarmPermissionsChangeReactor");
            throw null;
        }
        c cVar2 = this.f13604t;
        if (cVar2 == null) {
            j.k("notificationModel");
            throw null;
        }
        C4.g gVar2 = new C4.g(cVar2.f23329a.f4265f, cVar2, 25);
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC0419l.u(new C0424q(new C4.e(5, new C4.g(gVar2, eVar, 4)), new L3.d(eVar, null), 2), eVar.f5505b);
        }
    }
}
