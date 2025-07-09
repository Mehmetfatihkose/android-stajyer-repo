# Android Stajyer Reposu

| Komut                   | Anlamı                                                                                    |
| ----------------------- | ----------------------------------------------------------------------------------------- |
| `git init`              | Yeni bir Git projesi başlatır. Bulunduğun klasörde `.git` klasörü oluşturur.              |
| `git status`            | Takip edilen dosyaların durumunu gösterir (değişti mi, eklendi mi, commit edildi mi vs.). |
| `git add <dosya>`       | Belirtilen dosyayı commit'e hazırlamak için ekler.                                        |
| `git add .`             | Tüm değişiklikleri (yeni/eklenen/silinecek) commit için ekler.                            |
| `git commit -m "mesaj"` | Değişiklikleri Git’e kaydeder. `-m` ile açıklama eklenir.                                 |
| `git log`               | Commit geçmişini listeler.                                                                |
| `git log --oneline`     | Commit geçmişini kısa özet halinde gösterir.                                              |
| `git diff`              | Yapılan değişiklikleri gösterir.                                                          |
| `git reset`             | Değişiklikleri staging alanından geri alır.                                               |
| `git reset --hard`      | Tüm değişiklikleri geri alır (dikkatli olun).                                             |
| `git rm <dosya>`        | Dosyayı silip Git’ten de kaldırır.                                                        |

| Komut                    | Anlamı                                                |
| ------------------------ | ----------------------------------------------------- |
| `git branch`             | Tüm branch’leri listeler, şu an aktif olanı gösterir. |
| `git branch <yeni-isim>` | Yeni bir branch oluşturur.                            |
| `git checkout <isim>`    | Belirtilen branch’e geçiş yapar.                      |
| `git checkout -b <isim>` | Yeni branch oluşturur ve hemen o branch’e geçer.      |
| `git merge <branch>`     | Belirtilen branch’i şu anki branch’e birleştirir.     |
| `git branch -d <isim>`   | Belirtilen branch’i siler.                            |

| Komut                                  | Anlamı                                               |
| -------------------------------------- | ---------------------------------------------------- |
| `git remote -v`                        | Uzak bağlantıları (GitHub adreslerini) listeler.     |
| `git remote add origin <URL>`          | GitHub’daki bir repo ile bağlantı kurar.             |
| `git push origin <branch>`             | Aktif branch’i GitHub’a gönderir.                    |
| `git push -u origin <branch>`          | Branch’i GitHub’a gönderip kalıcı takip başlatır.    |
| `git pull origin <branch>`             | GitHub’daki güncel kodları indirir.                  |
| `git clone <URL>`                      | Var olan bir GitHub reposunu bilgisayarına kopyalar. |
| `git remote set-url origin <yeni-URL>` | GitHub bağlantısını değiştirir.                      |
| `git fetch`                            | Uzak repo’dan güncellemeleri çeker ama birleştirmez. |
| `git push`                             | Son commit'leri remote'a gönderir.                   |
| `git pull`                             | Remote'dan güncellemeleri indirip birleştirir.       |
