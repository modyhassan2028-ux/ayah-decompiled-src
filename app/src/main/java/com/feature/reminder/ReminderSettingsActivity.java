package com.ayah.feature.reminder;

import C6.b;
import G4.m;
import K9.AbstractC0405x;
import L5.c;
import P9.d;
import android.os.Bundle;
import j$.time.LocalTime;
import k3.f;
import k3.h;
import p053f.g;
import p056f2.F;
import p110k9.a;
import p110k9.o;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class ReminderSettingsActivity extends Hilt_ReminderSettingsActivity {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f13864a0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public c f13867Y;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final d f13865W = AbstractC0405x.d();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final o f13866X = a.d(new S5.a(this, 0));

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final g f13868Z = m(new F(2), new b(10, this));

    @Override // com.ayah.feature.reminder.Hilt_ReminderSettingsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p032d.a.a(this, new p074h0.d(1815461044, new m(5, this), true));
    }

    public final c s() {
        c cVar = this.f13867Y;
        if (cVar != null) {
            return cVar;
        }
        j.k("reminderPresenter");
        throw null;
    }

    public final void t(h hVar, LocalTime localTime) {
        if (hVar instanceof f) {
            AbstractC0405x.x(this.f13865W, null, new S5.b(this, hVar, localTime, null, 1), 3);
        }
    }
}
