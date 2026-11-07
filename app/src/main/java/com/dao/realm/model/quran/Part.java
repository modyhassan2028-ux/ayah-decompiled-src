package com.ayah.dao.realm.model.quran;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;
import io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class Part extends RealmObject implements com_ayah_dao_realm_model_quran_PartRealmProxyInterface {
    private String arabicTitle;
    private RealmList<Chapter> chapters;
    private String englishTitle;

    @PrimaryKey
    private long identifier;

    @Index
    private long number;
    private RealmList<Quarter> quarters;
    private RealmList<Verse> verses;

    /* JADX WARN: Multi-variable type inference failed */
    public Part() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$arabicTitle("");
        realmSet$englishTitle("");
        realmSet$chapters(new RealmList());
        realmSet$quarters(new RealmList());
        realmSet$verses(new RealmList());
    }

    public final String getArabicTitle() {
        return realmGet$arabicTitle();
    }

    public final RealmList<Chapter> getChapters() {
        return realmGet$chapters();
    }

    public final String getEnglishTitle() {
        return realmGet$englishTitle();
    }

    public final long getIdentifier() {
        return realmGet$identifier();
    }

    public final long getNumber() {
        return realmGet$number();
    }

    public final RealmList<Quarter> getQuarters() {
        return realmGet$quarters();
    }

    public final RealmList<Verse> getVerses() {
        return realmGet$verses();
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public String realmGet$arabicTitle() {
        return this.arabicTitle;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public RealmList realmGet$chapters() {
        return this.chapters;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public String realmGet$englishTitle() {
        return this.englishTitle;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public long realmGet$identifier() {
        return this.identifier;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public long realmGet$number() {
        return this.number;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public RealmList realmGet$quarters() {
        return this.quarters;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public RealmList realmGet$verses() {
        return this.verses;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public void realmSet$arabicTitle(String str) {
        this.arabicTitle = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public void realmSet$chapters(RealmList realmList) {
        this.chapters = realmList;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public void realmSet$englishTitle(String str) {
        this.englishTitle = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public void realmSet$identifier(long j) {
        this.identifier = j;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public void realmSet$number(long j) {
        this.number = j;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public void realmSet$quarters(RealmList realmList) {
        this.quarters = realmList;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public void realmSet$verses(RealmList realmList) {
        this.verses = realmList;
    }

    public final void setArabicTitle(String str) {
        j.e(str, "<set-?>");
        realmSet$arabicTitle(str);
    }

    public final void setChapters(RealmList<Chapter> realmList) {
        j.e(realmList, "<set-?>");
        realmSet$chapters(realmList);
    }

    public final void setEnglishTitle(String str) {
        j.e(str, "<set-?>");
        realmSet$englishTitle(str);
    }

    public final void setIdentifier(long j) {
        realmSet$identifier(j);
    }

    public final void setNumber(long j) {
        realmSet$number(j);
    }

    public final void setQuarters(RealmList<Quarter> realmList) {
        j.e(realmList, "<set-?>");
        realmSet$quarters(realmList);
    }

    public final void setVerses(RealmList<Verse> realmList) {
        j.e(realmList, "<set-?>");
        realmSet$verses(realmList);
    }
}
