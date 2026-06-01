// Mensagem ao clicar no botão "Saiba Mais"
function mostrarMensagem() {
    const mensagem = document.getElementById("mensagem");

    mensagem.innerHTML =
        "🌱 A energia sustentável reduz a poluição, preserva recursos naturais e contribui para um futuro mais limpo para as próximas gerações.";

    mensagem.style.color = "#2e8b57";
}

// Exibe mensagem de boas-vindas ao carregar a página
window.onload = function () {
    console.log("Site Energia Sustentável carregado com sucesso!");
};

// Simulação de envio do formulário
document.addEventListener("DOMContentLoaded", function () {

    const formulario = document.querySelector("form");

    formulario.addEventListener("submit", function (event) {
        event.preventDefault();

        const nome = document.querySelector('input[type="text"]').value;

        if (nome.trim() === "") {
            alert("Por favor, digite seu nome.");
            return;
        }

        alert(`Obrigado pelo contato, ${nome}! Sua mensagem foi enviada com sucesso.`);

        formulario.reset();
    });

});

// Efeito de destaque ao passar o mouse nos cards
const cards = document.querySelectorAll(".card");

cards.forEach(card => {
    card.addEventListener("mouseenter", () => {
        card.style.backgroundColor = "#e8f5e9";
    });

    card.addEventListener("mouseleave", () => {
        card.style.backgroundColor = "#ffffff";
    });
});

// Contador de visitas (armazenado no navegador)
let visitas = localStorage.getItem("visitas");

if (!visitas) {
    visitas = 1;
} else {
    visitas = Number(visitas) + 1;
}

localStorage.setItem("visitas", visitas);

console.log(`Número de visitas: ${visitas}`);
