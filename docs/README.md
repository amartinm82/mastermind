<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="generator" content="Asciidoctor 2.0.8">
<meta name="author" content="Álvaro Martín Martín">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,300italic,400,400italic,600,600italic%7CNoto+Serif:400,400italic,700,700italic%7CDroid+Sans+Mono:400,700">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body class="book">
<div id="header">
<h1>Master Mind. Solución 9.3. <strong>mvp.pm.withComposite</strong></h1>
<div class="details">
<span id="author" class="author">Álvaro Martín Martín</span><br>
<span id="email" class="email"><a href="mailto:amartinm82@gmail.com">amartinm82@gmail.com</a></span><br>
<span id="revnumber">version 0.0.1</span>
</div>
<div id="toc" class="toc">
<div id="toctitle">Índice</div>
<ul class="sectlevel1">
<li><a href="#requisitos-1-básica">Requisitos 1. <strong>Básica</strong></a></li>
<li><a href="#vista-de-lógicadiseño">Vista de Lógica/Diseño</a>
<ul class="sectlevel2">
<li><a href="#arquitectura">Arquitectura</a></li>
<li><a href="#paquete-mastermind">Paquete <em>mastermind</em></a></li>
<li><a href="#paquete-mastermind-views">Paquete <em>mastermind.views</em></a></li>
<li><a href="#paquete-mastermind-models">Paquete <em>mastermind.models</em></a></li>
<li><a href="#paquete-mastermind-controllers">Paquete <em>mastermind.controllers</em></a></li>
<li><a href="#paquete-mastermind-utils">Paquete <em>mastermind.utils</em></a></li>
</ul>
</li>
<li><a href="#calidad-del-software">Calidad del Software</a>
<ul class="sectlevel2">
<li><a href="#diseño">Diseño</a></li>
<li><a href="#rediseño">Rediseño</a></li>
</ul>
</li>
<li><a href="#vista-de-desarrolloimplementación">Vista de Desarrollo/Implementación</a></li>
<li><a href="#vista-de-desplieguefísica">Vista de Despliegue/Física</a></li>
<li><a href="#vista-de-procesos">Vista de Procesos</a></li>
</ul>
</div>
</div>
<div id="content">
<div class="sect1">
<h2 id="requisitos-1-básica">Requisitos 1. <strong>Básica</strong></h2>
<div class="sectionbody">
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><div class="content"><div class="ulist">
<ul>
<li>
<p><a href="https://en.wikipedia.org/wiki/Mastermind_(board_game)"><strong>Wiki</strong></a> - <a href="https://www.youtube.com/watch?v=2-hTeg2M6GQ"><strong>Youtube</strong></a></p>
<div class="ulist">
<ul>
<li>
<p><em>Funcionalidad: <strong>Básica</strong></em></p>
</li>
<li>
<p><em>Interfaz: <strong>Texto</strong></em></p>
</li>
<li>
<p><em>Distribución: <strong>Standalone</strong></em></p>
</li>
<li>
<p><em>Persistencia: <strong>No</strong></em></p>
</li>
</ul>
</div>
</li>
</ul>
</div></div></td>
<td class="tableblock halign-left valign-top"><div class="content"><div class="imageblock">
<div class="content">
<img src="images/Dibujo.jpg" alt="Dibujo">
</div>
</div></div></td>
</tr>
</tbody>
</table>
</div>
</div>
<div class="sect1">
<h2 id="vista-de-lógicadiseño">Vista de Lógica/Diseño</h2>
<div class="sectionbody">
<div class="ulist">
<ul>
<li>
<p>Arquitectura Documento/Vista mediante <strong>Patrón de Vista Separada</strong></p>
</li>
</ul>
</div>
<div class="sect2">
<h3 id="arquitectura">Arquitectura</h3>
<div class="imageblock">
<div class="content">
<img src="images/version2Arquitectura.svg" alt="version2Arquitectura" width="754" height="531">
</div>
</div>
</div>
<div class="sect2">
<h3 id="paquete-mastermind">Paquete <em>mastermind</em></h3>
<div class="imageblock">
<div class="content">
<img src="images/version2Mastermind.svg" alt="version2Mastermind" width="782" height="579">
</div>
</div>
</div>
<div class="sect2">
<h3 id="paquete-mastermind-views">Paquete <em>mastermind.views</em></h3>
<div class="imageblock">
<div class="content">
<img src="images/mastermindViews.svg" alt="mastermindViews" width="2544" height="1641">
</div>
</div>
</div>
<div class="sect2">
<h3 id="paquete-mastermind-models">Paquete <em>mastermind.models</em></h3>
<div class="imageblock">
<div class="content">
<img src="images/paqueteMastermindModel.svg" alt="paqueteMastermindModel" width="1209" height="1775">
</div>
</div>
</div>
<div class="sect2">
<h3 id="paquete-mastermind-controllers">Paquete <em>mastermind.controllers</em></h3>
<div class="imageblock">
<div class="content">
<img src="images/paqueteMastermindController.svg" alt="paqueteMastermindController" width="2163" height="843">
</div>
</div>
</div>
<div class="sect2">
<h3 id="paquete-mastermind-utils">Paquete <em>mastermind.utils</em></h3>
<div class="imageblock">
<div class="content">
<img src="images/mastermindUtils2.svg" alt="mastermindUtils2" width="764" height="511">
</div>
</div>
</div>
</div>
</div>
<div class="sect1">
<h2 id="calidad-del-software">Calidad del Software</h2>
<div class="sectionbody">
<div class="sect2">
<h3 id="diseño">Diseño</h3>
<div class="ulist">
<ul>
<li>
<p><span class="red line-through"><em><strong>Método largo</strong>: Método "play" de Mastermind,&#8230;&#8203;</em></span></p>
</li>
</ul>
</div>
</div>
<div class="sect2">
<h3 id="rediseño">Rediseño</h3>
<div class="ulist">
<ul>
<li>
<p><em>Nueva interfaz: Gráfica</em></p>
<div class="ulist">
<ul>
<li>
<p><span class="red line-through"><em><strong>Clases Grandes</strong>: los Modelos asumen la responsabilidad y crecen en líneas, métodos, atributos, &#8230;&#8203; con cada nueva tecnología</em></span></p>
</li>
<li>
<p><span class="red line-through"><em><strong>Alto acoplamiento</strong>: los Modelos con cada nueva tecnología de interfaz (consola, gráficos, web, &#8230;&#8203;)</em></span></p>
</li>
<li>
<p><span class="red line-through"><em><strong>Baja cohesión</strong>: cada Modelo está gestionando sus atributos y las tecnologías de interfaz</em></span></p>
</li>
<li>
<p><span class="red line-through"><em><strong>Open/Close</strong>: hay que modificar los modelos que estaban funcionando previamente para escoger una tecnología de vista u otra (if&#8217;s anidados)</em></span></p>
</li>
</ul>
</div>
</li>
<li>
<p><em>Nuevas funcionalidades: undo/redo, demo, estadísiticas,&#8230;&#8203;</em></p>
<div class="ulist">
<ul>
<li>
<p><span class="red"><em><strong>Clases Grandes</strong>: los Modelos asumen la responsabilidad y crecen en líneas, métodos, atributos, &#8230;&#8203; con las nuevas funcionalidades</em></span></p>
</li>
<li>
<p><span class="red"><em><strong>Open/Close</strong>: hay que modificar los modelos que estaban funcionando previamente para incorporar nuevas funcionalidades</em></span></p>
</li>
</ul>
</div>
</li>
</ul>
</div>
</div>
</div>
</div>
<div class="sect1">
<h2 id="vista-de-desarrolloimplementación">Vista de Desarrollo/Implementación</h2>
<div class="sectionbody">
<div class="imageblock">
<div class="content">
<img src="images/diagramaImplementacion.svg" alt="diagramaImplementacion" width="1157" height="254">
</div>
</div>
</div>
</div>
<div class="sect1">
<h2 id="vista-de-desplieguefísica">Vista de Despliegue/Física</h2>
<div class="sectionbody">
<div class="imageblock">
<div class="content">
<img src="images/diagramaDespliegue.svg" alt="diagramaDespliegue" width="220" height="202">
</div>
</div>
</div>
</div>
<div class="sect1">
<h2 id="vista-de-procesos">Vista de Procesos</h2>
<div class="sectionbody">
<div class="ulist">
<ul>
<li>
<p>No hay concurrencia</p>
</li>
</ul>
</div>
</div>
</div>
</div>
<div id="footer">
<div id="footer-text">
Version 0.0.1<br>
Last updated 2020-10-24 20:37:38 +0200
</div>
</div>
</html>