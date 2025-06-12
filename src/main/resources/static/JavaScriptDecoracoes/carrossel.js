document.addEventListener("DOMContentLoaded", () => {
    // Carrossel padrão
    (() => {
        const track = document.querySelector(".carousel-track");
        const slides = Array.from(track.children);
        const prevButton = document.querySelector(".carousel-button.prev");
        const nextButton = document.querySelector(".carousel-button.next");
        const progressBars = document.querySelectorAll(".progress-bar-fill");

        let currentIndex = 0;
        let timer;
        const slideInterval = 6000;

        const updateSlidePosition = () => {
            track.style.transform = `translateX(-${currentIndex * 100}%)`;
            resetProgress();
        };

        const resetProgress = () => {
            progressBars.forEach((bar, index) => {
                bar.style.width = index === currentIndex ? "0%" : "0%";
            });
        };

        const fillProgress = () => {
            let progress = 0;
            clearInterval(timer);

            timer = setInterval(() => {
                progress += 100 / (slideInterval / 100);
                progressBars[currentIndex].style.width = `${progress}%`;

                if (progress >= 100) {
                    clearInterval(timer);
                    nextSlide();
                }
            }, 100);
        };

        const nextSlide = () => {
            currentIndex = (currentIndex + 1) % slides.length;
            updateSlidePosition();
            fillProgress();
        };

        const prevSlide = () => {
            currentIndex = (currentIndex - 1 + slides.length) % slides.length;
            updateSlidePosition();
            fillProgress();
        };

        nextButton.addEventListener("click", nextSlide);
        prevButton.addEventListener("click", prevSlide);

        updateSlidePosition();
        fillProgress();
    })();

    // Carrossel Mobile
    (() => {
        const track = document.querySelector(".mobile-carousel-track");
        const slides = Array.from(track.children);
        const prevButton = document.querySelector(".mobile-carousel-button.mobile-prev");
        const nextButton = document.querySelector(".mobile-carousel-button.mobile-next");
        const progressBars = document.querySelectorAll(".mobile-progress-bar-fill");

        let currentIndex = 0;
        let timer;
        const slideInterval = 6000;

        const updateSlidePosition = () => {
            track.style.transform = `translateX(-${currentIndex * 100}%)`;
            resetProgress();
        };

        const resetProgress = () => {
            progressBars.forEach((bar, index) => {
                bar.style.width = index === currentIndex ? "0%" : "0%";
            });
        };

        const fillProgress = () => {
            let progress = 0;
            clearInterval(timer);

            timer = setInterval(() => {
                progress += 100 / (slideInterval / 100);
                progressBars[currentIndex].style.width = `${progress}%`;

                if (progress >= 100) {
                    clearInterval(timer);
                    nextSlide();
                }
            }, 100);
        };

        const nextSlide = () => {
            currentIndex = (currentIndex + 1) % slides.length;
            updateSlidePosition();
            fillProgress();
        };

        const prevSlide = () => {
            currentIndex = (currentIndex - 1 + slides.length) % slides.length;
            updateSlidePosition();
            fillProgress();
        };

        nextButton.addEventListener("click", nextSlide);
        prevButton.addEventListener("click", prevSlide);

        updateSlidePosition();
        fillProgress();
    })();
});
