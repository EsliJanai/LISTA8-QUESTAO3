<!DOCTYPE html>
<html>
<head>
    <title>Formulário</title>
</head>
<body>
    <form action="ConcatenarDadosServlet" method="post">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" required><br><br>

        <label for="estadoCivil">Estado Civil:</label>
        <select id="estadoCivil" name="estadoCivil">
            <option value="Solteiro(a)">Solteiro(a)</option>
            <option value="Casado(a)">Casado(a)</option>
            <!-- Adicione outras opções de estado civil aqui -->
        </select><br><br>

        <label for="faixaEtaria">Faixa Etária:</label>
        <select id="faixaEtaria" name="faixaEtaria">
            <option value="3 a 10 anos">3 a 10 anos</option>
            <option value="11 a 25 anos">11 a 25 anos</option>
            <option value="36 a 55 anos">36 a 55 anos</option>
            <option value="56 a 100 anos">56 a 100 anos</option>
        </select><br><br>

        <input type="submit" value="Enviar">
    </form>
</body>
</html>
