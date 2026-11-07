package com.ayah.dao.realm.factory;

import B3.f;
import io.realm.DynamicRealm;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.exceptions.RealmFileException;
import p110k9.a;
import p110k9.g;
import p181s2.o;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class RealmFactory {
    private final g isInitialized$delegate;
    private final RealmConfiguration realmConfiguration;

    public RealmFactory(RealmConfiguration realmConfiguration) {
        j.e(realmConfiguration, "realmConfiguration");
        this.realmConfiguration = realmConfiguration;
        this.isInitialized$delegate = a.d(new f(11, this));
    }

    private final boolean isInitialized() {
        return ((Boolean) this.isInitialized$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isInitialized_delegate$lambda$1(RealmFactory realmFactory) {
        try {
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(realmFactory.realmConfiguration);
            try {
                long version = dynamicRealm.getVersion();
                o.e(dynamicRealm, null);
                if (version == realmFactory.realmConfiguration.getSchemaVersion()) {
                    return true;
                }
                Realm.deleteRealm(realmFactory.realmConfiguration);
                return true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    o.e(dynamicRealm, th);
                    throw th2;
                }
            }
        } catch (RealmFileException unused) {
            Realm.deleteRealm(realmFactory.realmConfiguration);
            return true;
        }
    }

    public static /* synthetic */ Realm openRealm$default(RealmFactory realmFactory, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return realmFactory.openRealm(z10);
    }

    public final Realm openRealm(boolean z10) {
        if (!isInitialized()) {
            throw new IllegalStateException(p245z2.a.D("Realm for ", this.realmConfiguration.getRealmFileName(), " is not yet initialized."));
        }
        try {
            Realm realm = Realm.getInstance(this.realmConfiguration);
            j.b(realm);
            return realm;
        } catch (RealmFileException e10) {
            if (z10) {
                throw e10;
            }
            Realm.deleteRealm(this.realmConfiguration);
            return openRealm(true);
        }
    }
}
