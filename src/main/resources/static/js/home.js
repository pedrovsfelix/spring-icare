var randomPhoto = document.getElementById('bg-img-primary');
images = ['img/serv1.png', 'img/serv2.png', 'img/serv3.png', 'img/medico4.png', 'img/medico5.png', 'img/medico6.png'];
var imgCount = images.length;
var number = Math.floor(Math.random() * imgCount);
window.onload = function() {
    randomPhoto.style.backgroundImage = 'url(' + images[number] + ')'
}