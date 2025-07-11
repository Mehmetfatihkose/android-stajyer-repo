# Modern Minimal Sayaç Uygulaması

## Proje Özeti
Bu proje, modern ve minimal bir tasarıma sahip, işlevsel bir sayaç uygulamasıdır. Uygulama, kullanıcı dostu arayüzü, sade renk paleti ve animasyonlu etkileşimleriyle öne çıkar. Sayaç değeri artırılabilir, azaltılabilir, sıfırlanabilir ve otomatik olarak artacak şekilde başlatılıp durdurulabilir.

---

## Tasarım ve Kullanılan Dosyalar

### 1. **Arayüz (UI) ve Yerleşim**
- **`app/src/main/res/layout/activity_main.xml`**
  - Sayaç değeri için büyük, ortalanmış bir TextView
  - Altında yatayda üç buton: ➖ Azalt, 🔁 Sıfırla, ➕ Artır
  - Altında ortalanmış geniş bir “Başlat/Durdur” butonu
  - En altta dalga efekti için dekoratif bir View

### 2. **Renk Paleti**
- **`app/src/main/res/values/colors.xml`**
  - Arka plan, buton, buton basılı, metin ve dalga için özel renkler
  - Modern ve sade bir görünüm için optimize edildi

### 3. **Buton Tasarımı**
- **`app/src/main/res/drawable/rounded_button.xml`**
  - Yuvarlatılmış köşeli, mavi, ripple efektli buton stili
- **`app/src/main/res/anim/button_elevation.xml`**
  - Butonlara tıklanınca gölgelenme (elevation) animasyonu

### 4. **Arka Plan Efekti**
- **`app/src/main/res/drawable/wave_shape.xml`**
  - Alt kısımda sade, modern bir dalga efekti

### 5. **Tema ve Koyu Mod**
- **`app/src/main/res/values/themes.xml`**
- **`app/src/main/res/values-night/themes.xml`**
  - Uygulamanın genel tema ayarları ve koyu mod desteği
  - Arka plan ve yazı tipi gibi temel görsel ayarlar

### 6. **Sayaç Mantığı ve Animasyon**
- **`app/src/main/java/com/mehmetfatihkose/kotlinogreniyorum2/MainActivity.kt`**
  - Sayaç değerini artırma, azaltma, sıfırlama ve otomatik artırma (Başlat/Durdur) işlevleri
  - Sayaç 100+ olduğunda animasyon

---

## Özellikler
- Modern ve minimal arayüz
- Açık ve koyu mod desteği
- Yuvarlatılmış, ripple ve gölgeli butonlar
- Otomatik sayaç başlat/durdur
- 100+ değerinde animasyonlu sayaç
- Alt kısımda dekoratif dalga efekti

---

## Kullanım
1. Uygulamayı açın.
2. Sayaç değerini ➕ Artır, ➖ Azalt veya 🔁 Sıfırla butonlarıyla değiştirin.
3. “Başlat” butonuna basarak sayacı otomatik artırın, “Durdur” ile durdurun.
4. Koyu modda da modern görünüm korunur.

---

## Dosya Yapısı ve Amaçları
| Dosya/Yol | Amaç |
|-----------|-------|
| `activity_main.xml` | Ana arayüz ve yerleşim |
| `colors.xml` | Renk paleti |
| `rounded_button.xml` | Modern buton stili |
| `button_elevation.xml` | Buton animasyonu |
| `wave_shape.xml` | Dalga arka plan efekti |
| `themes.xml` / `themes-night.xml` | Tema ve koyu mod |
| `MainActivity.kt` | Sayaç mantığı ve animasyon |

---

## Notlar
- Tüm tasarım ve kodlar modern Android standartlarına uygundur.
- Renkler ve stiller kolayca değiştirilebilir.
- Proje, sade ve kullanıcı dostu bir sayaç uygulaması örneğidir. 