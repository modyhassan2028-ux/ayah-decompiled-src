package com.ayah.ui;

import A.C0040q0;
import C6.b;
import I1.I;
import I1.S;
import J3.x;
import K9.AbstractC0405x;
import M.k;
import N9.AbstractC0419l;
import N9.C0424q;
import P9.d;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.AboutActivity;
import com.ayah.AyahImportActivity;
import com.ayah.PreferencesActivity;
import com.ayah.R;
import com.ayah.feature.reminder.ReminderSettingsActivity;
import com.ayah.ui.PreferencesFragment;
import java.util.WeakHashMap;
import p056f2.G;
import p056f2.K;
import p150o9.c;
import p226x2.p;
import p226x2.q;
import p226x2.r;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesFragment extends Hilt_PreferencesFragment {

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final d f13938B0 = AbstractC0405x.d();

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f13939C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f13940D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public Context f13941E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public x f13942F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public k f13943G0;

    @Override // androidx.preference.PreferenceFragmentCompat, p056f2.AbstractComponentCallbacksC0947u
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.e(layoutInflater, "inflater");
        View viewA = super.A(layoutInflater, viewGroup, bundle);
        RecyclerView recyclerView = this.f12779q0;
        recyclerView.setClipToPadding(false);
        b bVar = new b(22, recyclerView);
        WeakHashMap weakHashMap = S.f3689a;
        I.m(recyclerView, bVar);
        return viewA;
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void B() {
        AbstractC0405x.h(this.f13938B0, null);
        this.f16143V = true;
    }

    @Override // androidx.preference.PreferenceFragmentCompat, p056f2.AbstractComponentCallbacksC0947u
    public final void F(Bundle bundle) {
        if (this.f13939C0) {
            bundle.putBoolean("SI_IS_EXPORTING", true);
        }
        super.F(bundle);
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public final void T(Bundle bundle) {
        r rVar = this.f12778p0;
        k kVar = this.f13943G0;
        c cVar = null;
        if (kVar == null) {
            j.k("preferenceDataStoreWrapper");
            throw null;
        }
        rVar.f24333d = kVar;
        Context contextM = M();
        PreferenceScreen preferenceScreen = this.f12778p0.f24336h;
        final int i10 = 1;
        rVar.f24335f = true;
        q qVar = new q(contextM, rVar);
        XmlResourceParser xml = contextM.getResources().getXml(R.xml.ayah_prefs);
        try {
            PreferenceGroup preferenceGroupC = qVar.c(xml, preferenceScreen);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preferenceGroupC;
            preferenceScreen2.n(rVar);
            SharedPreferences.Editor editor = rVar.f24334e;
            if (editor != null) {
                editor.apply();
            }
            final int i11 = 0;
            rVar.f24335f = false;
            r rVar2 = this.f12778p0;
            PreferenceScreen preferenceScreen3 = rVar2.f24336h;
            if (preferenceScreen2 != preferenceScreen3) {
                if (preferenceScreen3 != null) {
                    preferenceScreen3.q();
                }
                rVar2.f24336h = preferenceScreen2;
                this.f12780r0 = true;
                if (this.f12781s0) {
                    i iVar = this.f12783u0;
                    if (!iVar.hasMessages(1)) {
                        iVar.obtainMessage(1).sendToTarget();
                    }
                }
            }
            FragmentActivity fragmentActivityL = L();
            this.f13941E0 = fragmentActivityL.getApplicationContext();
            String str = p125m4.b.f19614a;
            if ("ar".equals(Resources.getSystem().getConfiguration().locale.getLanguage())) {
                PreferenceGroup preferenceGroup = (PreferenceGroup) S("prefKeyCategoryTextAppearance");
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) S("arabic");
                if (preferenceGroup != null && checkBoxPreference != null) {
                    synchronized (preferenceGroup) {
                        try {
                            checkBoxPreference.A();
                            if (checkBoxPreference.f12756Y == preferenceGroup) {
                                checkBoxPreference.f12756Y = null;
                            }
                            if (preferenceGroup.f12787f0.remove(checkBoxPreference)) {
                                String str2 = checkBoxPreference.f12738B;
                                if (str2 != null) {
                                    preferenceGroup.f12785d0.put(str2, Long.valueOf(checkBoxPreference.f12763t));
                                    preferenceGroup.f12786e0.removeCallbacks(preferenceGroup.f12792k0);
                                    preferenceGroup.f12786e0.post(preferenceGroup.f12792k0);
                                }
                                if (preferenceGroup.f12790i0) {
                                    checkBoxPreference.A();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    p pVar = preferenceGroup.f12754W;
                    if (pVar != null) {
                        Handler handler = pVar.f24322y;
                        p211v6.b bVar = pVar.f24323z;
                        handler.removeCallbacks(bVar);
                        handler.post(bVar);
                    }
                }
            }
            Preference preferenceS = S("importData");
            if (preferenceS != null) {
                preferenceS.f12765v = new p226x2.i(this) { // from class: p6.a

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ PreferencesFragment f20999s;

                    {
                        this.f20999s = this;
                    }

                    @Override // p226x2.i
                    public final boolean b(Preference preference) {
                        switch (i11) {
                            case 0:
                                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                                intent.setType("*/*");
                                intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/*", "text/*"});
                                PreferencesFragment preferencesFragment = this.f20999s;
                                if (preferencesFragment.f16138L == null) {
                                    throw new IllegalStateException("Fragment " + preferencesFragment + " not attached to Activity");
                                }
                                K kO = preferencesFragment.o();
                                if (kO.f15948C == null) {
                                    kO.f15982w.getClass();
                                    j.e(intent, "intent");
                                    throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
                                }
                                String str3 = preferencesFragment.f16165v;
                                G g = new G();
                                g.f15941r = str3;
                                g.f15942s = 1;
                                kO.f15951F.addLast(g);
                                kO.f15948C.S(intent);
                                return true;
                            case 1:
                                PreferencesFragment preferencesFragment2 = this.f20999s;
                                FragmentActivity fragmentActivityL2 = preferencesFragment2.L();
                                if (!(fragmentActivityL2 instanceof PreferencesActivity)) {
                                    return false;
                                }
                                preferencesFragment2.f13939C0 = true;
                                PreferencesActivity preferencesActivity = (PreferencesActivity) fragmentActivityL2;
                                if (preferencesActivity.f13667a0 == null) {
                                    ProgressDialog progressDialog = new ProgressDialog(preferencesActivity);
                                    preferencesActivity.f13667a0 = progressDialog;
                                    progressDialog.setMessage(preferencesActivity.getString(R.string.please_wait));
                                    preferencesActivity.f13667a0.show();
                                }
                                AbstractC0405x.x(preferencesFragment2.f13938B0, null, new C0040q0(preferencesFragment2, (c) null, 18), 3);
                                return true;
                            case 2:
                                PreferencesFragment preferencesFragment3 = this.f20999s;
                                preferencesFragment3.R(new Intent(preferencesFragment3.j(), (Class<?>) ReminderSettingsActivity.class));
                                return true;
                            default:
                                PreferencesFragment preferencesFragment4 = this.f20999s;
                                preferencesFragment4.R(new Intent(preferencesFragment4.L(), (Class<?>) AboutActivity.class));
                                return true;
                        }
                    }
                };
            }
            Preference preferenceS2 = S("exportData");
            if (preferenceS2 != null) {
                preferenceS2.f12765v = new p226x2.i(this) { // from class: p6.a

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ PreferencesFragment f20999s;

                    {
                        this.f20999s = this;
                    }

                    @Override // p226x2.i
                    public final boolean b(Preference preference) {
                        switch (i10) {
                            case 0:
                                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                                intent.setType("*/*");
                                intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/*", "text/*"});
                                PreferencesFragment preferencesFragment = this.f20999s;
                                if (preferencesFragment.f16138L == null) {
                                    throw new IllegalStateException("Fragment " + preferencesFragment + " not attached to Activity");
                                }
                                K kO = preferencesFragment.o();
                                if (kO.f15948C == null) {
                                    kO.f15982w.getClass();
                                    j.e(intent, "intent");
                                    throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
                                }
                                String str3 = preferencesFragment.f16165v;
                                G g = new G();
                                g.f15941r = str3;
                                g.f15942s = 1;
                                kO.f15951F.addLast(g);
                                kO.f15948C.S(intent);
                                return true;
                            case 1:
                                PreferencesFragment preferencesFragment2 = this.f20999s;
                                FragmentActivity fragmentActivityL2 = preferencesFragment2.L();
                                if (!(fragmentActivityL2 instanceof PreferencesActivity)) {
                                    return false;
                                }
                                preferencesFragment2.f13939C0 = true;
                                PreferencesActivity preferencesActivity = (PreferencesActivity) fragmentActivityL2;
                                if (preferencesActivity.f13667a0 == null) {
                                    ProgressDialog progressDialog = new ProgressDialog(preferencesActivity);
                                    preferencesActivity.f13667a0 = progressDialog;
                                    progressDialog.setMessage(preferencesActivity.getString(R.string.please_wait));
                                    preferencesActivity.f13667a0.show();
                                }
                                AbstractC0405x.x(preferencesFragment2.f13938B0, null, new C0040q0(preferencesFragment2, (c) null, 18), 3);
                                return true;
                            case 2:
                                PreferencesFragment preferencesFragment3 = this.f20999s;
                                preferencesFragment3.R(new Intent(preferencesFragment3.j(), (Class<?>) ReminderSettingsActivity.class));
                                return true;
                            default:
                                PreferencesFragment preferencesFragment4 = this.f20999s;
                                preferencesFragment4.R(new Intent(preferencesFragment4.L(), (Class<?>) AboutActivity.class));
                                return true;
                        }
                    }
                };
            }
            Preference preferenceS3 = S("reminders");
            final int i12 = 2;
            if (preferenceS3 != null) {
                preferenceS3.f12765v = new p226x2.i(this) { // from class: p6.a

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ PreferencesFragment f20999s;

                    {
                        this.f20999s = this;
                    }

                    @Override // p226x2.i
                    public final boolean b(Preference preference) {
                        switch (i12) {
                            case 0:
                                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                                intent.setType("*/*");
                                intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/*", "text/*"});
                                PreferencesFragment preferencesFragment = this.f20999s;
                                if (preferencesFragment.f16138L == null) {
                                    throw new IllegalStateException("Fragment " + preferencesFragment + " not attached to Activity");
                                }
                                K kO = preferencesFragment.o();
                                if (kO.f15948C == null) {
                                    kO.f15982w.getClass();
                                    j.e(intent, "intent");
                                    throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
                                }
                                String str3 = preferencesFragment.f16165v;
                                G g = new G();
                                g.f15941r = str3;
                                g.f15942s = 1;
                                kO.f15951F.addLast(g);
                                kO.f15948C.S(intent);
                                return true;
                            case 1:
                                PreferencesFragment preferencesFragment2 = this.f20999s;
                                FragmentActivity fragmentActivityL2 = preferencesFragment2.L();
                                if (!(fragmentActivityL2 instanceof PreferencesActivity)) {
                                    return false;
                                }
                                preferencesFragment2.f13939C0 = true;
                                PreferencesActivity preferencesActivity = (PreferencesActivity) fragmentActivityL2;
                                if (preferencesActivity.f13667a0 == null) {
                                    ProgressDialog progressDialog = new ProgressDialog(preferencesActivity);
                                    preferencesActivity.f13667a0 = progressDialog;
                                    progressDialog.setMessage(preferencesActivity.getString(R.string.please_wait));
                                    preferencesActivity.f13667a0.show();
                                }
                                AbstractC0405x.x(preferencesFragment2.f13938B0, null, new C0040q0(preferencesFragment2, (c) null, 18), 3);
                                return true;
                            case 2:
                                PreferencesFragment preferencesFragment3 = this.f20999s;
                                preferencesFragment3.R(new Intent(preferencesFragment3.j(), (Class<?>) ReminderSettingsActivity.class));
                                return true;
                            default:
                                PreferencesFragment preferencesFragment4 = this.f20999s;
                                preferencesFragment4.R(new Intent(preferencesFragment4.L(), (Class<?>) AboutActivity.class));
                                return true;
                        }
                    }
                };
            }
            Preference preferenceS4 = S("about");
            final int i13 = 3;
            if (preferenceS4 != null) {
                preferenceS4.f12765v = new p226x2.i(this) { // from class: p6.a

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ PreferencesFragment f20999s;

                    {
                        this.f20999s = this;
                    }

                    @Override // p226x2.i
                    public final boolean b(Preference preference) {
                        switch (i13) {
                            case 0:
                                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                                intent.setType("*/*");
                                intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/*", "text/*"});
                                PreferencesFragment preferencesFragment = this.f20999s;
                                if (preferencesFragment.f16138L == null) {
                                    throw new IllegalStateException("Fragment " + preferencesFragment + " not attached to Activity");
                                }
                                K kO = preferencesFragment.o();
                                if (kO.f15948C == null) {
                                    kO.f15982w.getClass();
                                    j.e(intent, "intent");
                                    throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
                                }
                                String str3 = preferencesFragment.f16165v;
                                G g = new G();
                                g.f15941r = str3;
                                g.f15942s = 1;
                                kO.f15951F.addLast(g);
                                kO.f15948C.S(intent);
                                return true;
                            case 1:
                                PreferencesFragment preferencesFragment2 = this.f20999s;
                                FragmentActivity fragmentActivityL2 = preferencesFragment2.L();
                                if (!(fragmentActivityL2 instanceof PreferencesActivity)) {
                                    return false;
                                }
                                preferencesFragment2.f13939C0 = true;
                                PreferencesActivity preferencesActivity = (PreferencesActivity) fragmentActivityL2;
                                if (preferencesActivity.f13667a0 == null) {
                                    ProgressDialog progressDialog = new ProgressDialog(preferencesActivity);
                                    preferencesActivity.f13667a0 = progressDialog;
                                    progressDialog.setMessage(preferencesActivity.getString(R.string.please_wait));
                                    preferencesActivity.f13667a0.show();
                                }
                                AbstractC0405x.x(preferencesFragment2.f13938B0, null, new C0040q0(preferencesFragment2, (c) null, 18), 3);
                                return true;
                            case 2:
                                PreferencesFragment preferencesFragment3 = this.f20999s;
                                preferencesFragment3.R(new Intent(preferencesFragment3.j(), (Class<?>) ReminderSettingsActivity.class));
                                return true;
                            default:
                                PreferencesFragment preferencesFragment4 = this.f20999s;
                                preferencesFragment4.R(new Intent(preferencesFragment4.L(), (Class<?>) AboutActivity.class));
                                return true;
                        }
                    }
                };
            }
            x xVar = this.f13942F0;
            if (xVar == null) {
                j.k("preferencesStore");
                throw null;
            }
            AbstractC0419l.u(new C0424q(AbstractC0419l.n(xVar.f4308b, 1), new B2.d(this, cVar, 15), 2), this.f13938B0);
            x xVar2 = this.f13942F0;
            if (xVar2 == null) {
                j.k("preferencesStore");
                throw null;
            }
            AbstractC0419l.u(new C0424q(AbstractC0419l.n(xVar2.f4313h, 1), new p158p6.b(this, cVar, i11), 2), this.f13938B0);
            x xVar3 = this.f13942F0;
            if (xVar3 == null) {
                j.k("preferencesStore");
                throw null;
            }
            AbstractC0419l.u(new C0424q(AbstractC0419l.n(xVar3.f4309c, 1), new p158p6.b(this, cVar, i10), 2), this.f13938B0);
            if (bundle == null || !bundle.getBoolean("SI_IS_EXPORTING", false)) {
                return;
            }
            this.f13939C0 = true;
            PreferencesActivity preferencesActivity = (PreferencesActivity) fragmentActivityL;
            if (preferencesActivity.f13667a0 == null) {
                ProgressDialog progressDialog = new ProgressDialog(preferencesActivity);
                preferencesActivity.f13667a0 = progressDialog;
                progressDialog.setMessage(preferencesActivity.getString(R.string.please_wait));
                preferencesActivity.f13667a0.show();
            }
            AbstractC0405x.x(this.f13938B0, null, new C0040q0(this, cVar, 18), 3);
        } catch (Throwable th2) {
            xml.close();
            throw th2;
        }
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void w(int i10, int i11, Intent intent) {
        super.w(i10, i11, intent);
        FragmentActivity fragmentActivityJ = j();
        Uri data = intent != null ? intent.getData() : null;
        if (i10 != 1 || fragmentActivityJ == null || data == null) {
            return;
        }
        Intent intent2 = new Intent(fragmentActivityJ, (Class<?>) AyahImportActivity.class);
        intent2.setData(data);
        R(intent2);
    }
}
