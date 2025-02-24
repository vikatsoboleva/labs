const box = document.getElementById('box');
const playPauseBtn = document.getElementById('play-pause');
const nextBtn = document.getElementById('next');
const prevBtn = document.getElementById('prev');
let isPlaying = false;

playPauseBtn.addEventListener('click', () => {
    box.classList.remove('jump-down', 'move-right', 'move-left');
    if (!isPlaying) {
        box.classList.add('jump-up');
        playPauseBtn.innerHTML = '<i class="bi bi-pause-fill"></i>';
    } else {
        box.classList.add('jump-down');
        playPauseBtn.innerHTML = '<i class="bi bi-play-fill"></i>';
    }
    isPlaying = !isPlaying;
    box.addEventListener('animationend', () => {
        box.classList.remove('jump-up', 'jump-down');
    }, { once: true });
});

nextBtn.addEventListener('click', () => {
    box.classList.remove('jump-up', 'jump-down', 'move-left');
    box.classList.add('move-right');
    box.addEventListener('animationend', () => {
        box.classList.remove('move-right');
    }, { once: true });
});

prevBtn.addEventListener('click', () => {
    box.classList.remove('jump-up', 'jump-down', 'move-right');
    box.classList.add('move-left');
    box.addEventListener('animationend', () => {
        box.classList.remove('move-left');
    }, { once: true });
});
