# Ayah — com.ayah 7.8.2 (كود مفكوك)

مصدر تطبيق **Ayah** (اسم الحزمة `com.ayah`، الإصدار 7.8.2، versionCode 7820) بعد فكّه من ملف APK الذي قدّمه صاحب المشروع.

## إيه اللي في المستودع
- `app/src/main/java/com/ayah/` — كود التطبيق بعد فك dex بـ jadx 1.5.6 (138 ملف بأسماء الحزمة الحقيقية).
- `app/src/main/res/` — الموارد بعد فكها بـ apktool 3.0.3 (188 ملف layout، 520 نص في `values/strings.xml`، plus locale واحد).
- `app/src/main/AndroidManifest.xml` — المانيفست المفكوك.
- `docs/badging.txt` — بيانات الحزمة كما يقرأها aapt2.
- `docs/assets-list.txt` — شجرة مجلد assets في الـAPK (بدون 9060 صورة مصحف).

## بنية التطبيق الحقيقية (من الكود)
`com/ayah/feature/` : quran · tafsir · audioconfig · ayahmenu · infolist · library · khatmah · miniplayer · navigator · notelist · starredlist · today · onboarding · reminder · audio · reciterlist · picker
`com/ayah/common/` : data · ui · reminder
`com/ayah/dao/` : realm · backup
`com/ayah/ui/` : widgets و utilities · `note` · `share`

## المحتوى الموجود داخل الـAPK (أصول يمكن استخراجها كما هي)
| الملف | المحتوى |
|---|---|
| `assets/databases/quran-text.db` | 6462 صفًا من نص القرآن (جدول bookEntry) |
| `assets/databases/ar-mokhtasar.db` | تفسير المختصر (عربي) |
| `assets/databases/en-saheeh.db` | ترجمة/تفسير إنجليزي |
| `assets/books/books.json` | فهرس الكتب |
| `assets/realm/quran.realm` · `audio.realm` | فهارس الصوت والقُرّاء |
| `assets/quran-images/` | 9060 صورة صفحات المصحف |
| `assets/hafs_smart_08.ttf` · `quran_titles.ttf` · `quran_numbers.ttf` | خطوط المصحف |

## حدود الفك (بدون مبالغة)
- كود التطبيق نفسه مقروء بأسماء حقيقية، لكن **حزم المكتبات** أُعيدت تسميتها بواسطة R8 (A، B، C2…) فلا تُقرأ أسماؤها.
- ملفات `.so` الأصلية (realm) وتلك الخاصة بـ androidx غير مشمولة.
- الواجهة مكتوبة بـ Jetpack Compose (474 ملفًا يشير إلى `androidx.compose`) داخل الكود نفسه، فلا توجد ملفات تصميم منفصلة لها.
