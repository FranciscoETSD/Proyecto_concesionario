package com.miniboyan;

import com.miniboyan.dao.ClienteDao;
import com.miniboyan.model.Cliente;

public class Main {
    public static void main(String[] args) {
        //Cliente cliente = new Cliente("2204", "Carla Cecilia Diaz", "Cochabamba", "C/Jacinto Anaya nº228", 4283475);
        //Cliente Laura = new Cliente("2202", "Laura meneces", "Cochabamba", "C/Jacinto Anaya nº228", 75931857);
        //Cliente Lorena = new Cliente("1232", "Lorena Izquierdo", "Cochabamba", "C/Benedicto 221", 8678312);
        //Cliente Tadeo = new Cliente("0704-99", "Tadeo Saavedra Diaz", "Cochabamba", "C/Mirador Estaban nº12", 9682372);
        //Cliente Juanjo = new Cliente("6532", "Juanjo Estrada", "Cochabamba", "C/Santa Fe s/n", 4637382);
        //Cliente Gabriela = new Cliente("21-06-99", "Gabriela Cotgire Alarcon", "Cochabamba", "C/Churipujllu", 4792111);

        //CRUD TABLA CLIENTES
        ClienteDao clienteDao = new ClienteDao();
        //CREATE
        //clienteDao.addCliente(Laura);
        //clienteDao.addCliente(Lorena);
        //clienteDao.addCliente(Tadeo);
        //clienteDao.addCliente(Juanjo);
        //clienteDao.addCliente(Gabriela);


        //READ
        /*
        List<Cliente> clientes = clienteDao.getAllClientes();
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);

            System.out.println(cliente);
        }
        */
        //UPDATE
        //Cliente cliente = new Cliente("0208", "Wilson Fuentes", "Cochabamba", "C/Francisco Pizarro", 4283475);
        //ClienteDao.updateCliente(cliente);

        //DELETE
        ClienteDao.deleteCliente("0208");
        }
    }



