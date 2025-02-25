document.getElementById('generateButton').addEventListener('click', function() {
    const randomNumbers = [];
    for (let i = 0; i < 100; i++) {
        randomNumbers.push(Math.floor(Math.random() * 900) + 100);
    }

    const ranges = {
        '100-399': 0,
        '400-699': 0,
        '700-999': 0
    };

    randomNumbers.forEach(num => {
        if (num >= 100 && num <= 399) {
            ranges['100-399']++;
        } else if (num >= 400 && num <= 699) {
            ranges['400-699']++;
        } else if (num >= 700 && num <= 999) {
            ranges['700-999']++;
        }
    });

    const data = {
        labels: ['100-399', '400-699', '700-999'],
        datasets: [{
            data: [ranges['100-399'], ranges['400-699'], ranges['700-999']],
            backgroundColor: ['#FF5733', '#33FF57', '#3357FF'],
            borderColor: ['#FF5733', '#33FF57', '#3357FF'],
            borderWidth: 1
        }]
    };

    const config = {
        type: 'pie',
        data: data,
        options: {
            responsive: true,
            plugins: {
                legend: {
                    position: 'top',
                },
                tooltip: {
                    callbacks: {
                        label: function(tooltipItem) {
                            return `${tooltipItem.label}: ${tooltipItem.raw} чисел`;
                        }
                    }
                }
            }
        }
    };

    const ctx = document.getElementById('pieChart').getContext('2d');

    if (window.chart) {
        window.chart.destroy();
    }

    window.chart = new Chart(ctx, config);

    document.getElementById('numbersContainer').innerHTML = `
        <h3>Сгенерированные числа:</h3>
        <p>${randomNumbers.join(', ')}</p>
    `;
});
