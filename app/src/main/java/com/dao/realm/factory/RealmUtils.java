package com.ayah.dao.realm.factory;

import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import R9.d;
import android.content.Context;
import android.support.v4.media.session.p;
import com.ayah.dao.realm.module.AudioModule;
import com.ayah.dao.realm.module.QuranModule;
import com.ayah.dao.realm.module.TafsirModule;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import java.io.File;
import java.util.List;
import p110k9.a;
import p110k9.y;
import p120l9.l;
import p150o9.c;
import p251z9.j;
import q9.e;
import q9.i;
import v9.g;

/* JADX INFO: loaded from: classes.dex */
public final class RealmUtils {
    private static final String AUDIO_DB_NAME = "audio.realm";
    private static final String AUDIO_DB_PATH = "realm/audio.realm";
    private static final long AUDIO_DB_VERSION = 18;
    public static final RealmUtils INSTANCE = new RealmUtils();
    private static final String REALM_DB_NAME = "quran.realm";
    private static final String REALM_DB_PATH = "realm/quran.realm";
    private static final long REALM_DB_VERSION = 8;
    private static final RealmFactory audioFactory;
    private static final RealmFactory databaseFactory;

    /* JADX INFO: renamed from: com.ayah.dao.realm.factory.RealmUtils$clearRealmsForV18$2, reason: invalid class name */
    @e(c = "com.ayah.dao.realm.factory.RealmUtils$clearRealmsForV18$2", f = "RealmUtils.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p241y9.e {
        final /* synthetic */ Context $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, c cVar) {
            super(2, cVar);
            this.$appContext = context;
        }

        @Override // q9.a
        public final c create(Object obj, c cVar) {
            return new AnonymousClass2(this.$appContext, cVar);
        }

        @Override // p241y9.e
        public final Object invoke(InterfaceC0402u interfaceC0402u, c cVar) {
            return ((AnonymousClass2) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
        }

        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.e(obj);
            List<String> listS = l.S(new String[]{"quran_text", "sq_nahi", "ar_mokhtasar", "ar_siraj", "ar_muyassar", "ar_saadi", "ar_ibn_juzayy", "zh_makin", "en_saheeh_intl", "fr_noor_intl", "de_bubenheim", "id_sabeq", "fa_ruwwad", "pt_nasr", "so_jacob", "es_garcia", "tr_ruwwad", "ur_junagarhi"});
            TafsirModule tafsirModule = new TafsirModule();
            Context context = this.$appContext;
            for (String str : listS) {
                RealmUtils realmUtils = RealmUtils.INSTANCE;
                RealmConfiguration realmConfigurationBuild = new RealmConfiguration.Builder().assetFile(p245z2.a.D("realm/", str, ".realm")).name(p.z(str, ".realm")).schemaVersion(16L).modules(tafsirModule, new Object[0]).build();
                j.d(realmConfigurationBuild, "build(...)");
                Realm.deleteRealm(realmConfigurationBuild);
                try {
                    g.f(new File(context.getFilesDir(), str + ".realm.management"));
                    new File(context.getFilesDir(), str + ".realm.lock").delete();
                } catch (Exception unused) {
                }
            }
            return y.f19095a;
        }
    }

    /* JADX INFO: renamed from: com.ayah.dao.realm.factory.RealmUtils$clearRealmsForV22$2, reason: invalid class name and case insensitive filesystem */
    @e(c = "com.ayah.dao.realm.factory.RealmUtils$clearRealmsForV22$2", f = "RealmUtils.kt", l = {}, m = "invokeSuspend")
    public static final class C07842 extends i implements p241y9.e {
        final /* synthetic */ Context $appContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07842(Context context, c cVar) {
            super(2, cVar);
            this.$appContext = context;
        }

        @Override // q9.a
        public final c create(Object obj, c cVar) {
            return new C07842(this.$appContext, cVar);
        }

        @Override // p241y9.e
        public final Object invoke(InterfaceC0402u interfaceC0402u, c cVar) {
            return ((C07842) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
        }

        @Override // q9.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.e(obj);
            List<String> listS = l.S(new String[]{"ar_today", "today"});
            Context context = this.$appContext;
            for (String str : listS) {
                try {
                    g.f(new File(context.getFilesDir(), str + ".realm"));
                    g.f(new File(context.getFilesDir(), str + ".realm.management"));
                    new File(context.getFilesDir(), str + ".realm.lock").delete();
                } catch (Exception unused) {
                }
            }
            return y.f19095a;
        }
    }

    static {
        RealmConfiguration realmConfigurationBuild = new RealmConfiguration.Builder().assetFile(REALM_DB_PATH).name(REALM_DB_NAME).schemaVersion(REALM_DB_VERSION).modules(new QuranModule(), new Object[0]).build();
        j.d(realmConfigurationBuild, "build(...)");
        databaseFactory = new RealmFactory(realmConfigurationBuild);
        RealmConfiguration realmConfigurationBuild2 = new RealmConfiguration.Builder().assetFile(AUDIO_DB_PATH).name(AUDIO_DB_NAME).schemaVersion(AUDIO_DB_VERSION).modules(new AudioModule(), new Object[0]).build();
        j.d(realmConfigurationBuild2, "build(...)");
        audioFactory = new RealmFactory(realmConfigurationBuild2);
    }

    private RealmUtils() {
    }

    public static final Realm getAudioDatabase() {
        return RealmFactory.openRealm$default(audioFactory, false, 1, null);
    }

    public static /* synthetic */ void getAudioDatabase$annotations() {
    }

    public static final Realm getDatabase() {
        return RealmFactory.openRealm$default(databaseFactory, false, 1, null);
    }

    public static /* synthetic */ void getDatabase$annotations() {
    }

    private final /* synthetic */ <T> RealmConfiguration provideConfiguration(String str, String str2, long j, T t2) {
        RealmConfiguration realmConfigurationBuild = new RealmConfiguration.Builder().assetFile(str).name(str2).schemaVersion(j).modules(t2, new Object[0]).build();
        j.d(realmConfigurationBuild, "build(...)");
        return realmConfigurationBuild;
    }

    public final void clearRealmsForV13(Context context) {
        j.e(context, "appContext");
        RealmConfiguration realmConfigurationBuild = new RealmConfiguration.Builder().assetFile("realm/ayah.realm").name("main.realm").schemaVersion(3L).modules(new QuranModule(), new Object[0]).build();
        j.d(realmConfigurationBuild, "build(...)");
        Realm.deleteRealm(realmConfigurationBuild);
        RealmConfiguration realmConfigurationBuild2 = new RealmConfiguration.Builder().assetFile("realm/reciters.realm").name(AUDIO_DB_NAME).schemaVersion(3L).modules(new AudioModule(), new Object[0]).build();
        j.d(realmConfigurationBuild2, "build(...)");
        Realm.deleteRealm(realmConfigurationBuild2);
        List<p110k9.j> listS = l.S(new p110k9.j[]{new p110k9.j("realm/mokhtasar.realm", "tafseer.realm"), new p110k9.j("realm/muyassar.realm", "muyassar.realm"), new p110k9.j("realm/saadi.realm", "saadi.realm"), new p110k9.j("realm/en_saheeh_intl.realm", "en_saheeh_intl.realm")});
        TafsirModule tafsirModule = new TafsirModule();
        for (p110k9.j jVar : listS) {
            String str = (String) jVar.f19077r;
            String str2 = (String) jVar.f19078s;
            RealmConfiguration realmConfigurationBuild3 = new RealmConfiguration.Builder().assetFile(str).name(str2).schemaVersion(2L).modules(tafsirModule, new Object[0]).build();
            j.d(realmConfigurationBuild3, "build(...)");
            Realm.deleteRealm(realmConfigurationBuild3);
            try {
                g.f(new File(context.getFilesDir(), str2 + ".management"));
                new File(context.getFilesDir(), str2 + ".lock").delete();
            } catch (Exception unused) {
            }
        }
    }

    public final Object clearRealmsForV18(Context context, c cVar) {
        R9.e eVar = H.f5322a;
        Object objI = AbstractC0405x.I(d.f7436t, new AnonymousClass2(context, null), cVar);
        return objI == p161p9.a.f21156r ? objI : y.f19095a;
    }

    public final Object clearRealmsForV22(Context context, c cVar) {
        R9.e eVar = H.f5322a;
        Object objI = AbstractC0405x.I(d.f7436t, new C07842(context, null), cVar);
        return objI == p161p9.a.f21156r ? objI : y.f19095a;
    }
}
