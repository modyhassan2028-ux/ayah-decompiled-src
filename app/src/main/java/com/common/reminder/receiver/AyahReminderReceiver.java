package com.ayah.common.reminder.receiver;

import H9.o;
import H9.v;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.ayah.MainActivity;
import com.ayah.R;
import com.ayah.common.data.dao.notification.ReminderDestination;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.squareup.moshi.C;
import com.squareup.moshi.z;
import j$.time.LocalTime;
import k3.a;
import k3.c;
import k3.e;
import k3.f;
import k3.g;
import k3.h;
import p120l9.l;
import p181s2.s;
import p216w1.p;
import p251z9.j;
import p251z9.w;

/* JADX INFO: loaded from: classes.dex */
public final class AyahReminderReceiver extends BroadcastReceiver {
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        h gVar;
        boolean[] booleanArrayExtra;
        String stringExtra;
        int i10;
        Object sura;
        int i11;
        String string;
        j.e(context, "context");
        j.e(intent, "intent");
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        String string2 = data.toString();
        j.d(string2, "toString(...)");
        if (v.R0(string2, "ayah://reminder/app", false)) {
            int iHashCode = string2.hashCode();
            if (iHashCode != -179642442) {
                if (iHashCode != 522553746) {
                    if (iHashCode == 1210761824 && string2.equals("ayah://reminder/app/verse_of_the_day")) {
                        gVar = new f(a.VERSE_OF_THE_DAY);
                    } else {
                        gVar = null;
                    }
                } else if (string2.equals("ayah://reminder/app/sura_kahf")) {
                    gVar = new f(a.SURA_KAHF);
                } else {
                    gVar = null;
                }
            } else if (string2.equals("ayah://reminder/app/daily_reading")) {
                gVar = new f(a.DAILY_READING);
            } else {
                gVar = null;
            }
        } else if (v.R0(string2, "ayah://reminder/custom", false)) {
            String stringExtra2 = intent.getStringExtra("EXTRA_REMINDER_TITLE");
            String strQ1 = o.q1(string2, "ayah://reminder/custom/");
            String stringExtra3 = intent.getStringExtra("EXTRA_REMINDER_DESTINATION");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            ReminderDestination reminderDestination = (ReminderDestination) AbstractC0813f2.l(new C(new z(0)), w.b(ReminderDestination.class)).b(stringExtra3);
            Integer numS0 = v.S0(strQ1);
            if (stringExtra2 == null || numS0 == null || reminderDestination == null) {
                gVar = null;
            } else {
                gVar = new g(numS0.intValue(), stringExtra2, reminderDestination);
            }
        } else {
            gVar = null;
        }
        if (gVar == null || (booleanArrayExtra = intent.getBooleanArrayExtra("EXTRA_REPEAT_DAYS")) == null || (stringExtra = intent.getStringExtra("EXTRA_ISO_TIME")) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 33 || s.c(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            Object systemService = context.getSystemService("notification");
            j.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            boolean z10 = gVar instanceof f;
            if (z10) {
                int iOrdinal = ((f) gVar).f18973a.ordinal();
                if (iOrdinal == 0) {
                    i10 = 3;
                    sura = c.f18970a;
                } else if (iOrdinal == 1) {
                    i10 = 3;
                    sura = new ReminderDestination.Sura(18, 293);
                } else {
                    if (iOrdinal != 2) {
                        throw new A6.a();
                    }
                    sura = e.f18972a;
                    i10 = 3;
                }
            } else {
                i10 = 3;
                if (!(gVar instanceof g)) {
                    throw new A6.a();
                }
                sura = ((g) gVar).f18976c;
            }
            if (z10) {
                int iOrdinal2 = ((f) gVar).f18973a.ordinal();
                if (iOrdinal2 == 0) {
                    i11 = 2;
                } else if (iOrdinal2 == 1) {
                    i11 = i10;
                } else {
                    if (iOrdinal2 != 2) {
                        throw new A6.a();
                    }
                    i11 = 4;
                }
            } else {
                if (!(gVar instanceof g)) {
                    throw new A6.a();
                }
                i11 = ((g) gVar).f18974a + 4;
            }
            String strD = AbstractC0813f2.l(new C(new z(0)), w.b(ReminderDestination.class)).d(sura);
            int i12 = MainActivity.f13622J0;
            Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
            intent2.putExtra("EXTRA_REMINDER_DESTINATION", strD);
            intent2.setFlags(268468224);
            PendingIntent activity = PendingIntent.getActivity(context, i11, intent2, 201326592);
            if (z10) {
                int iOrdinal3 = ((f) gVar).f18973a.ordinal();
                if (iOrdinal3 == 0) {
                    string = context.getString(R.string.daily_reading_reminder);
                } else if (iOrdinal3 == 1) {
                    string = context.getString(R.string.sura_kahf_reminder);
                } else {
                    if (iOrdinal3 != 2) {
                        throw new A6.a();
                    }
                    string = context.getString(R.string.today_reminder);
                }
            } else {
                if (!(gVar instanceof g)) {
                    throw new A6.a();
                }
                string = ((g) gVar).f18975b;
            }
            j.b(string);
            p pVar = new p(context, "ayah_reminders");
            pVar.g = activity;
            pVar.f23607e = p.b(context.getString(R.string.reminder));
            pVar.f23608f = p.b(string);
            pVar.f23620t.icon = R.drawable.ic_notification;
            pVar.f23616p = context.getColor(R.color.tint);
            pVar.f23617q = 1;
            pVar.c(16, true);
            Notification notificationA = pVar.a();
            j.d(notificationA, "build(...)");
            notificationManager.notify(i11, notificationA);
        } else {
            i10 = 3;
        }
        Boolean[] boolArrQ0 = l.q0(booleanArrayExtra);
        LocalTime localTime = LocalTime.parse(stringExtra);
        k3.j jVar = new k3.j(boolArrQ0[0].booleanValue(), boolArrQ0[1].booleanValue(), boolArrQ0[2].booleanValue(), boolArrQ0[i10].booleanValue(), boolArrQ0[4].booleanValue(), boolArrQ0[5].booleanValue(), boolArrQ0[6].booleanValue());
        g gVar2 = gVar instanceof g ? (g) gVar : null;
        String str = gVar2 != null ? gVar2.f18975b : null;
        j.b(localTime);
        PendingIntent pendingIntentU = va.g.u(context, data, localTime, jVar, str);
        Object systemService2 = context.getSystemService("alarm");
        j.c(systemService2, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService2;
        alarmManager.cancel(pendingIntentU);
        if (N7.f.a(alarmManager)) {
            long jO = va.g.o(localTime, jVar);
            if (jO > 0) {
                alarmManager.setExactAndAllowWhileIdle(1, jO, pendingIntentU);
            }
        }
    }
}
