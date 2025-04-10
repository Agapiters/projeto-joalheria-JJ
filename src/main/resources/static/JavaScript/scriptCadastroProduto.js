document.addEventListener("DOMContentLoaded", () => {
	const form = document.getElementById("cadastroProdutoForm");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const nomeProduto = document.getElementById("nomeProduto").value;
		const descricao = document.getElementById("descricao").value;
		const preco = document.getElementById("preco").value;
		const img = document.getElementById("img").value;
		const categoriaProduto = document.getElementById("categoriaProduto").value;
        const tipoProduto = document.getElementById("tipoProduto").value;

		try {
			const response = await fetch("http://localhost:8080/cadastrocliente", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body:JSON.stringify({
					nomeProduto,
					descricao,
					preco,
					img,
					categoriaProduto,
                    tipoProduto
				}),
			});

			if (response.ok) {
				window.location.href = "enviado2.html";
			} else {
				alert("Falha ao cadastrar produto");
			}
		} catch (error) {
			console.error("Erro ao cadastrar produto: ", error);
		}
	});
});