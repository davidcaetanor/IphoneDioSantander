package model;


import java.util.Scanner;

public class Iphone extends Operacoes {
    private String userName = null;
    private String musicName;
    private String number;

    public Iphone() {
        Scanner sc = new Scanner(System.in);
        boolean ligado = true;

        while (ligado) {
            System.out.println("""
                    Menu Iphone y2000:
                    1 - Cadastrar Nome do Usuario
                    2 - Reprodutor de Musica
                    3 - Contatos
                    4 - SafariBrowser
                    5 - Desligar
                    """);
            System.out.print("Escolha uma opcao: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.println();
                    if (userName == null) {
                        System.out.println("Digite o Nome do usuario: ");
                        String name = sc.nextLine();
                        setUserName(name);
                        System.out.println("Usuario Cadastrado com Sucesso!");
                    } else {
                        System.out.println("Usuario Ja Cadastrado! Usuario: " + getUserName());
                    }
                }
                case 2 -> {
                    do {
                        System.out.println();
                        System.out.println("""
                                Reprodutor de Musica
                                1 - Escolher Musica
                                2 - Trocar Musica
                                3 - Parar Musica
                                4 - Voltar Ao Menu Principal
                                """);
                        System.out.print("Escolha uma opcao: ");
                        op = sc.nextInt();
                        sc.nextLine();

                        switch (op) {
                            case 1 -> {
                                System.out.println("Digite o nome da musica");
                                String musicplay = sc.nextLine();
                                setMusicName(musicplay);
                                playMusic(getMusicName());
                            }
                            case 2 -> {
                                changeMusic();
                            }
                            case 3 -> {
                                stopMusic();
                            }
                            case 4 -> System.out.println("Voltando...");
                            default -> System.out.println("Opcao invalida!");
                        }
                    } while (op != 4);
                }
                case 3 -> {
                    do {
                        System.out.println();
                        System.out.println("""
                                Funçao Telefone Movel
                                1 - Telefonar para alguem
                                2 - Desligar chamada
                                3 - Atender Chamada
                                4 - Voltar Ao Menu Principal
                                """);
                        System.out.print("Escolha uma opcao: ");
                        op = sc.nextInt();
                        sc.nextLine();
                        switch (op) {
                            case 1 -> {
                                System.out.print("Digite o numero para efetuar a ligaçao");
                                int numero = sc.nextInt();
                                setNumber(numero);
                                startCall(getNumber());
                            }
                            case 2 -> {
                                endCall();
                            }
                            case 3 -> {
                                answer();
                            }
                            case 4 -> System.out.println("Voltando ao menu..");
                            default -> System.out.println("Opcao Invallida");
                        }
                    } while (op != 4);
                }
                case 4 -> {
                    do {
                        System.out.println();
                        System.out.println("""
                                Safari Browser
                                1 - Cadastrar URL para navegar
                                2 - Nova aba
                                3 - Atualizar Pagina
                                4 - Voltar Ao Menu Principal
                                """);
                        System.out.print("Escolha uma opcao: ");
                        op = sc.nextInt();
                        sc.nextLine();
                        switch (op) {
                            case 1 -> {
                                String url = sc.nextLine();
                                System.out.println("Indo ate " + url);
                            }
                            case 2 -> newTab();
                            case 3 -> refreshPage();
                            case 4 -> System.out.println("Retornando ao menu Principal");
                        }
                    } while (op != 4);
                }
                case 5 -> {
                    ligado = false;
                }
                default -> System.out.println("Opçao Invalida");
            }


        }
        sc.close();
        System.out.println("Encerrando Sistema!!!");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = String.valueOf(number);
    }
}
