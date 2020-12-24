package info.wailynnzaw.mytv;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Category Zero",
            "Category One",
            "Category Two",
            "Category Three",
            "Category Four",
            "Category Five",
    };

    private static List<Movie> list;
    private static long count = 0;

    public static List<Movie> getList() {
        if (list == null) {
            list = setupMovies();
        }
        return list;
    }

    public static List<Movie> setupMovies() {
        list = new ArrayList<>();
        String title[] = {
                "Penthouse: War In Life Episode 01",
                "Penthouse: War In Life Episode 02",
                "Penthouse: War In Life Episode 03",
                "Penthouse: War In Life Episode 04",
                "Penthouse: War In Life Episode 05",
                "Penthouse: War In Life Episode 06",
                "Penthouse: War In Life Episode 07",
                "Penthouse: War In Life Episode 08",
                "Penthouse: War In Life Episode 09",
                "Penthouse: War In Life Episode 10",
                "Penthouse: War In Life Episode 11",
                "Penthouse: War In Life Episode 12",
                "Penthouse: War In Life Episode 13",
                "Penthouse: War In Life Episode 14",
                "Penthouse: War In Life Episode 15",
                "Penthouse: War In Life Episode 16",
                "Penthouse: War In Life Episode 17"
        };

        String description = "Fusce id nisi turpis. Praesent viverra bibendum semper. ";

        String studio[] = {
                "Penthouse: War In Life Episode 01",
                "Penthouse: War In Life Episode 02",
                "Penthouse: War In Life Episode 03",
                "Penthouse: War In Life Episode 04",
                "Penthouse: War In Life Episode 05",
                "Penthouse: War In Life Episode 06",
                "Penthouse: War In Life Episode 07",
                "Penthouse: War In Life Episode 08",
                "Penthouse: War In Life Episode 09",
                "Penthouse: War In Life Episode 10",
                "Penthouse: War In Life Episode 11",
                "Penthouse: War In Life Episode 12",
                "Penthouse: War In Life Episode 13",
                "Penthouse: War In Life Episode 14",
                "Penthouse: War In Life Episode 15",
                "Penthouse: War In Life Episode 16",
                "Penthouse: War In Life Episode 17"
        };
        String videoUrl[] = {
                "https://kshows.to/goto.php?url=aHR0cHM6LyAdeqwrwedffryretgsdFrsftrsvfsfsr9zdG9yYWdlLmdvb2dsZWFwaXMuY29tL2lkeWxsaWMtY2F0ZmlzaC0yODYyMTMvSVRGNlA2MzRYTEcxLzIzZF8xNjA4NjA1NDI2XzIxMzMxNi5tcDQ=",
                "https://kshows.to/goto.php?url=aHR0cHM6LyAawehyfcghysfdsDGDYdgdsfsdfwstdgdsgtert9zdG9yYWdlLmdvb2dsZWFwaXMuY29tL2lkeWxsaWMtY2F0ZmlzaC0yODYyMTMvWUFURkw5VkFTSkdXL3N0MjNfcGVudGhvdXNlLXdhci1pbi1saWZlLWVwaXNvZGUtMi4xNjA4NjA1NTU3Lm1wNA==",
                "https://kshows.to/goto.php?url=aHR0cHM6LyURASDGHUSRFSJGYfdsffsderFStewthsfSFtrftesdf9zdG9yYWdlLmdvb2dsZWFwaXMuY29tL3NhZ2Utc2lnaHQtMjk5MzE4LzRGVkw0RlFNTllDNS9zdDIzX3BlbnRob3VzZS13YXItaW4tbGlmZS1lcGlzb2RlLTMuMTYwODY1OTY5MC5tcDQ=",
                "https://kshows.to/goto.php?url=aHR0cHM6LyAdeqwrwedffryretgsdFrsftrsvfsfsr9zdG9yYWdlLmdvb2dsZWFwaXMuY29tL2xvY2FsLXRhbGVudC0yOTIyMTQvVU1ZNkVIRFEzQ04vMjJkXzE2MDg3NDQzNjZfMjEzNTI5Lm1wNA==",
                "https://kshows.to/goto.php?url=aHR0cHM6LyAdrefsdsdfwerFrefdsfrersfdsrfer363435349zdG9yYWdlLmdvb2dsZWFwaXMuY29tL3NhZ2Utc2lnaHQtMjk5MzE4LzlRNVBRODFXUEwyRC8yM2RfMTYwODY3MDI1M18yMTQxOTMubXA0",
                "https://kshows.to/goto.php?url=aHR0cHM6LyAawehyfcghysfdsDGDYdgdsfsdfwstdgdsgtert9zdG9yYWdlLmdvb2dsZWFwaXMuY29tL2lkeWxsaWMtY2F0ZmlzaC0yODYyMTMvMVJPQU5GU1Y5U0NELzIzZF8xNjA4NjE3OTYwXzIxNDE5NC5tcDQ=",
                "https://kshows.to/goto.php?url=aHR0cHM6LyAawehyfcghysfdsDGDYdgdsfsdfwstdgdsgtert9zdG9yYWdlLmdvb2dsZWFwaXMuY29tL3NhZ2Utc2lnaHQtMjk5MzE4LzZPTUk3WkE3Q0NZL3N0MjNfcGVudGhvdXNlLXdhci1pbi1saWZlLWVwaXNvZGUtNy4xNjA4NjY4MjAwLm1wNA==",
                "https://kshows.to/goto.php?url=aHR0cHM6LyURASDGHUSRFSJGYfdsffsderFStewthsfSFtrftesdf9zdG9yYWdlLmdvb2dsZWFwaXMuY29tL3NhZ2Utc2lnaHQtMjk5MzE4L0Q4MjFUTzQ3T1RBUC8yM2RfMTYwODY3MDYwNV8yMTUzNTQubXA0",
                "https://kshows.to/goto.php?url=aHR0cHM6LyAawehyfcghysfdsDGDYdgdsfsdfwstdgdsgtert9zdG9yYWdlLmdvb2dsZWFwaXMuY29tL2lkeWxsaWMtY2F0ZmlzaC0yODYyMTMvVzQ2OVIxUEIzTzRXL3N0MjNfcGVudGhvdXNlLXdhci1pbi1saWZlLWVwaXNvZGUtOS4xNjA4NjE0Mjc5Lm1wNA==",
                "https://kshows.to/goto.php?url=aHR0cHM6LyAdeqwrwedffryretgsdFrsftrsvfsfsr9zdG9yYWdlLmdvb2dsZWFwaXMuY29tL2xvY2FsLXRhbGVudC0yOTIyMTQvNUk5QjhNRkVVSTgvc3QyMl9wZW50aG91c2Utd2FyLWluLWxpZmUtZXBpc29kZS0xMC4xNjA4NzM0MjA3Lm1wNA==",
                "https://kshows.to/goto.php?url=aHR0cHM6LyAdeqwrwedffryretgsdFrsftrsvfsfsr9zdG9yYWdlLmdvb2dsZWFwaXMuY29tL2xvY2FsLXRhbGVudC0yOTIyMTQvOVZCMkNNR0gyOEFZL3N0MjJfcGVudGhvdXNlLXdhci1pbi1saWZlLWVwaXNvZGUtMTEuMTYwODczNDE5Ny5tcDQ=",
                "https://kshows.to/goto.php?url=aHR0cHM6LyAawehyfcghysfdsDGDYdgdsfsdfwstdgdsgtert9zdG9yYWdlLmdvb2dsZWFwaXMuY29tL2xvY2FsLXRhbGVudC0yOTIyMTQvNE5DUVRHUkFPQVQ3L3N0MjJfcGVudGhvdXNlLXdhci1pbi1saWZlLWVwaXNvZGUtMTIuMTYwODczNDM1NC5tcDQ=",
                "https://kshows.to/goto.php?url=aHR0cHM6LyURASDGHUSRFSJGYfdsffsderFStewthsfSFtrftesdf9zdG9yYWdlLmdvb2dsZWFwaXMuY29tL2xvY2FsLXRhbGVudC0yOTIyMTQvQ1VGM0ZKTlpPUkZPL3N0MjJfcGVudGhvdXNlLXdhci1pbi1saWZlLWVwaXNvZGUtMTMuMTYwODczNDQ4My5tcDQ=",
                "https://kshows.to/goto.php?url=aHR0cHM6LyURASDGHUSRFSJGYfdsffsderFStewthsfSFtrftesdf9zdG9yYWdlLmdvb2dsZWFwaXMuY29tL3NhZ2Utc2lnaHQtMjk5MzE4L0RVRjFZQUVZNDZFQS8yM2RfMTYwODcyNDM1N19lXzIxODcyMi5tcDQ=",
                "https://kshows.to/goto.php?url=aHR0cHM6LyAdeqwrwedffryretgsdFrsftrsvfsfsr9zdG9yYWdlLmdvb2dsZWFwaXMuY29tL3NhZ2Utc2lnaHQtMjk5MzE4L1BYUk4zNUZSNUhLUy8yM2RfMTYwODcyMDM0Nl9lXzIxODcyMy5tcDQ=",
                "https://kshows.to/goto.php?url=aHR0cHM6LyAdrefsdsdfwerFrefdsfrersfdsrfer363435349zdG9yYWdlLmdvb2dsZWFwaXMuY29tL2lkeWxsaWMtY2F0ZmlzaC0yODYyMTMvUEE5VVhZNF9VNUcvMjNkXzE2MDg2MDgxMjRfZV8yMTk3MDkubXA0",
                "https://kshows.to/goto.php?url=aHR0cHM6LyAdeqwrwedffryretgsdFrsftrsvfsfsr9zdG9yYWdlLmdvb2dsZWFwaXMuY29tL3NhZ2Utc2lnaHQtMjk5MzE4L1BJQ1NRX1dHQ1VEMS8yM2RfMTYwODY3MjI1Nl9lXzIxOTcxMC5tcDQ="
        };
        String bgImageUrl[] = {
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/bg.jpg"
        };
        String cardImageUrl[] = {
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/card.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/card.jpg"
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description,
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
        }

        return list;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}