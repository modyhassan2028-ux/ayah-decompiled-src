package com.ayah.dao.realm.model.quran;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class Quarter extends RealmObject implements com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface {
    private String arabicTitle;
    private String englishTitle;
    private long hizbFraction;
    private long hizbNumber;

    @PrimaryKey
    private long identifier;
    private Part part;
    private RealmList<Verse> verses;

    /* JADX WARN: Multi-variable type inference failed */
    public Quarter() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$arabicTitle("");
        realmSet$englishTitle("");
        realmSet$verses(new RealmList());
    }

    public final String getArabicTitle() {
        return realmGet$arabicTitle();
    }

    public final String getEnglishTitle() {
        return realmGet$englishTitle();
    }

    public final long getHizbFraction() {
        return realmGet$hizbFraction();
    }

    public final long getHizbNumber() {
        return realmGet$hizbNumber();
    }

    public final long getIdentifier() {
        return realmGet$identifier();
    }

    public final Part getPart() {
        return realmGet$part();
    }

    public final RealmList<Verse> getVerses() {
        return realmGet$verses();
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public String realmGet$arabicTitle() {
        return this.arabicTitle;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public String realmGet$englishTitle() {
        return this.englishTitle;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public long realmGet$hizbFraction() {
        return this.hizbFraction;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public long realmGet$hizbNumber() {
        return this.hizbNumber;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public long realmGet$identifier() {
        return this.identifier;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public Part realmGet$part() {
        return this.part;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public RealmList realmGet$verses() {
        return this.verses;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public void realmSet$arabicTitle(String str) {
        this.arabicTitle = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public void realmSet$englishTitle(String str) {
        this.englishTitle = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public void realmSet$hizbFraction(long j) {
        this.hizbFraction = j;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public void realmSet$hizbNumber(long j) {
        this.hizbNumber = j;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public void realmSet$identifier(long j) {
        this.identifier = j;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public void realmSet$part(Part part) {
        this.part = part;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public void realmSet$verses(RealmList realmList) {
        this.verses = realmList;
    }

    public final void setArabicTitle(String str) {
        j.e(str, "<set-?>");
        realmSet$arabicTitle(str);
    }

    public final void setEnglishTitle(String str) {
        j.e(str, "<set-?>");
        realmSet$englishTitle(str);
    }

    public final void setHizbFraction(long j) {
        realmSet$hizbFraction(j);
    }

    public final void setHizbNumber(long j) {
        realmSet$hizbNumber(j);
    }

    public final void setIdentifier(long j) {
        realmSet$identifier(j);
    }

    public final void setPart(Part part) {
        realmSet$part(part);
    }

    public final void setVerses(RealmList<Verse> realmList) {
        j.e(realmList, "<set-?>");
        realmSet$verses(realmList);
    }
}
