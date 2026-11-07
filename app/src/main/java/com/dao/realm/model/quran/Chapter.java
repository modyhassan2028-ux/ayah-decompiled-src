package com.ayah.dao.realm.model.quran;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;
import io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class Chapter extends RealmObject implements com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface {
    private String arabicTitle;
    private String englishTitle;
    private ChapterHeader header1405;
    private ChapterHeader header1441;

    @PrimaryKey
    private long identifier;
    private boolean isMeccan;

    @Index
    private long number;
    private String searchableKeywords;

    @Index
    private String searchableText;
    private String title;
    private String titleCodePoint;
    private RealmList<Verse> verses;

    /* JADX WARN: Multi-variable type inference failed */
    public Chapter() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$title("");
        realmSet$arabicTitle("");
        realmSet$englishTitle("");
        realmSet$titleCodePoint("");
        realmSet$searchableText("");
        realmSet$searchableKeywords("");
        realmSet$verses(new RealmList());
    }

    public final String getArabicTitle() {
        return realmGet$arabicTitle();
    }

    public final String getEnglishTitle() {
        return realmGet$englishTitle();
    }

    public final ChapterHeader getHeader1405() {
        return realmGet$header1405();
    }

    public final ChapterHeader getHeader1441() {
        return realmGet$header1441();
    }

    public final long getIdentifier() {
        return realmGet$identifier();
    }

    public final long getNumber() {
        return realmGet$number();
    }

    public final String getSearchableKeywords() {
        return realmGet$searchableKeywords();
    }

    public final String getSearchableText() {
        return realmGet$searchableText();
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final String getTitleCodePoint() {
        return realmGet$titleCodePoint();
    }

    public final RealmList<Verse> getVerses() {
        return realmGet$verses();
    }

    public final boolean isMeccan() {
        return realmGet$isMeccan();
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public String realmGet$arabicTitle() {
        return this.arabicTitle;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public String realmGet$englishTitle() {
        return this.englishTitle;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public ChapterHeader realmGet$header1405() {
        return this.header1405;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public ChapterHeader realmGet$header1441() {
        return this.header1441;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public long realmGet$identifier() {
        return this.identifier;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public boolean realmGet$isMeccan() {
        return this.isMeccan;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public long realmGet$number() {
        return this.number;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public String realmGet$searchableKeywords() {
        return this.searchableKeywords;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public String realmGet$searchableText() {
        return this.searchableText;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public String realmGet$title() {
        return this.title;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public String realmGet$titleCodePoint() {
        return this.titleCodePoint;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public RealmList realmGet$verses() {
        return this.verses;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$arabicTitle(String str) {
        this.arabicTitle = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$englishTitle(String str) {
        this.englishTitle = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$header1405(ChapterHeader chapterHeader) {
        this.header1405 = chapterHeader;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$header1441(ChapterHeader chapterHeader) {
        this.header1441 = chapterHeader;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$identifier(long j) {
        this.identifier = j;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$isMeccan(boolean z10) {
        this.isMeccan = z10;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$number(long j) {
        this.number = j;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$searchableKeywords(String str) {
        this.searchableKeywords = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$searchableText(String str) {
        this.searchableText = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$title(String str) {
        this.title = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$titleCodePoint(String str) {
        this.titleCodePoint = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
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

    public final void setHeader1405(ChapterHeader chapterHeader) {
        realmSet$header1405(chapterHeader);
    }

    public final void setHeader1441(ChapterHeader chapterHeader) {
        realmSet$header1441(chapterHeader);
    }

    public final void setIdentifier(long j) {
        realmSet$identifier(j);
    }

    public final void setMeccan(boolean z10) {
        realmSet$isMeccan(z10);
    }

    public final void setNumber(long j) {
        realmSet$number(j);
    }

    public final void setSearchableKeywords(String str) {
        j.e(str, "<set-?>");
        realmSet$searchableKeywords(str);
    }

    public final void setSearchableText(String str) {
        j.e(str, "<set-?>");
        realmSet$searchableText(str);
    }

    public final void setTitle(String str) {
        j.e(str, "<set-?>");
        realmSet$title(str);
    }

    public final void setTitleCodePoint(String str) {
        j.e(str, "<set-?>");
        realmSet$titleCodePoint(str);
    }

    public final void setVerses(RealmList<Verse> realmList) {
        j.e(realmList, "<set-?>");
        realmSet$verses(realmList);
    }
}
