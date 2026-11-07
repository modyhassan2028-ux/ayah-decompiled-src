package com.ayah.dao.realm.model.quran;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_ayah_dao_realm_model_quran_SectionRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class Section extends RealmObject implements com_ayah_dao_realm_model_quran_SectionRealmProxyInterface {

    @PrimaryKey
    private long identifier;
    private RealmList<Verse> verses;

    /* JADX WARN: Multi-variable type inference failed */
    public Section() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$verses(new RealmList());
    }

    public final long getIdentifier() {
        return realmGet$identifier();
    }

    public final RealmList<Verse> getVerses() {
        return realmGet$verses();
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_SectionRealmProxyInterface
    public long realmGet$identifier() {
        return this.identifier;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_SectionRealmProxyInterface
    public RealmList realmGet$verses() {
        return this.verses;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_SectionRealmProxyInterface
    public void realmSet$identifier(long j) {
        this.identifier = j;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_SectionRealmProxyInterface
    public void realmSet$verses(RealmList realmList) {
        this.verses = realmList;
    }

    public final void setIdentifier(long j) {
        realmSet$identifier(j);
    }

    public final void setVerses(RealmList<Verse> realmList) {
        j.e(realmList, "<set-?>");
        realmSet$verses(realmList);
    }
}
