# Converter Android App

An Android unit converter app supporting 10 conversion categories, including live currency exchange rates.

## Features

- **Temperature** — Celsius, Fahrenheit, Kelvin
- **Weight** — kg, lbs, oz, grams, and more
- **Length** — meters, feet, inches, miles, km, and more
- **Speed** — km/h, mph, m/s, knots
- **Frequency** — Hz, kHz, MHz, GHz
- **Currency** — live exchange rates via network API
- **Volume** — liters, gallons, fluid ounces, and more
- **Time** — seconds, minutes, hours, days, weeks, years
- **Area** — sq meters, sq feet, acres, hectares, and more
- **Fuel Efficiency** — MPG, L/100km, km/L

## Screenshots

<img width="294" height="613" alt="Screenshot 2026-05-19 at 6 14 31 PM" src="https://github.com/user-attachments/assets/3d450653-76f9-4060-b8df-fbd9990dadfe" />
<img width="294" height="613" alt="Screenshot 2026-05-19 at 6 11 32 PM" src="https://github.com/user-attachments/assets/7cd732c5-4d1e-49da-b153-96f62a34086a" />
<img width="294" height="613" alt="Screenshot 2026-05-19 at 6 14 44 PM" src="https://github.com/user-attachments/assets/5bdc3395-0e4b-4211-b928-ac3e0f68bf80" />


## Tech Stack

- **Language:** Java
- **Min SDK:** 21 (Android 5.0 Lollipop)
- **Target SDK:** 34 (Android 14)
- **Networking:** OkHttp 4.12
- **JSON parsing:** Gson 2.10
- **UI:** Material Design, ConstraintLayout

## Project Structure

```
app/src/main/java/com/bignerdranch/android/converter/
├── SplashScreen.java          # Launch screen
├── MainActivity.java          # Home screen with category buttons
├── Conversion.java            # Base conversion logic
├── *Conversions.java          # Per-category conversion formulas
└── *_cal.java                 # Per-category calculator activities
```

## Getting Started

1. Clone the repo:
   ```bash
   git clone https://github.com/calvinlee326/Converter.git
   ```
2. Open in Android Studio
3. Build and run on an emulator or physical device (API 21+)

## Permissions

- `INTERNET` — required for live currency exchange rate lookups

## Contributing

Feel free to fork this repository and contribute via pull requests.

1. Fork the repository.
2. Create a new branch: `git checkout -b feature-name`
3. Commit your changes: `git commit -m "Add feature-name"`
4. Push to the branch: `git push origin feature-name`
5. Submit a pull request.

## Contact

- LinkedIn: [Calvin Lee](https://www.linkedin.com/in/chunchenglee326/)
- Email: chunchenglee326@gmail.com
