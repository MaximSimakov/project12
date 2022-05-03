<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор - стоимость постройки дома</title>
<style>
body{

background: #c7b39b url(panel1.jpg);
color: #654321;
}
</style>

</head>
<body>
<h1>Калькулятор - стоимость постройки дома</h1>
<form action="${pageContext.request.contextPath}/main" method="post">

<p><span id="error">${error}</span></p>

<p><span id="error2">${error2}</span></p>

<b><br><label for="inform1">Введите данные:</label></b>

<br><br><label for="width">Ширина (в метрах):</label>
<input type="text" name="width" id="width" value="${width}">

<br><br><label for="length">Длина (в метрах):</label>
<input type="text" name="length" id="length" value="">

<br><br><label for="atazh">Этажность (кол-во):</label>
<input type="text" name="atazh" id="atazh" value="">

<br><br><label for="tsokol">Высота цоколя (в метрах):</label>
<input type="text" name="tsokol" id="tsokol" value="">

<br><br><label for="dlinaDoma">Длина всего дома (в метрах):</label>
<input type="text" name="dlinaDoma" id="dlinaDoma" value="">

<br><br><label for="perimetr">Периметр крыши (в квадратных метрах):</label>
<input type="text" name="perimetr" id="perimetr" value="">

<b><br><br><label for="inform2">Выберите данные:</label></b>
<br><br><label for="stena">Стена несущая:</label>
<select name="stena">
  <option value="kirp1">Кирпич 1шт.</option>
  <option value="kirp15">Кирпич 1,5шт.</option>
  <option value="kirp2">Кирпич 2шт.</option>
</select>

<br><br><label for="otdelka">Отделка наружная:</label>
<select name="otdelka">
  <option value="oblic">Облицованный кирпич</option>
  <option value="shtuk">Штукатурка</option>
  <option value="kamen">Дикий камень</option>
</select>

<br><br><label for="fundam">Фундамент:</label>
<select name="fundam">
  <option value="buronabiv">Буронабивной</option>
  <option value="lent">Ленточный</option>
  <option value="plit">Плитный</option>
</select>

<br><br><label for="vnutr">Внутр. перегородка:</label>
<select name="vnutr">
  <option value="yes">Да</option>
  <option value="no">Нет</option>
</select>

<br><br><label for="krsha">Крыша:</label>
<select name="krsha">
  <option value="metall">Металлочерепица</option>
  <option value="krovl">мягкая кровля</option>
</select>

<br><br><label for="oknaDveri">Окна + мет.двери:</label>
<select name="oknaDveri">
  <option value="da">Да</option>
  <option value="net">Нет</option>
</select>

<br><br><input type="submit" name="sign1" value="Вывести список подгруппы ">
<br><br><input type="submit" name="sign2" value="Рассчитать ">
<p>Цена:<span id="result">${result}</span>руб</p>

 </form>
</body>
</html>