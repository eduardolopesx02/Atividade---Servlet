<!DOCTYPE html>
<html>
<head>
    <title>Concatenar Dados</title>
</head>
<body>
    <h1>Formulário de Dados Pessoais</h1>
    <form action="concatenarServlet" method="post">
        Nome: <input type="text" name="nome" required><br>
        Estado Civil:
        <select name="estadoCivil">
            <option value="Solteiro(a)">Solteiro(a)</option>
            <option value="Casado(a)">Casado(a)</option>
            <!-- Adicione mais opções aqui, se necessário -->
        </select><br>
        Faixa Etária:
        <select name="faixaEtaria">
            <option value="3 a 10 anos">3 a 10 anos</option>
            <option value="11 a 25 anos">11 a 25 anos</option>
            <option value="36 a 55 anos">36 a 55 anos</option>
            <option value="56 a 100 anos">56 a 100 anos</option>
        </select><br>
        <input type="submit" value="Concatenar Dados">
    </form>
</body>
</html>
