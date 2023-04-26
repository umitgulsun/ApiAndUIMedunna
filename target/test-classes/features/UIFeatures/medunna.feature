@MedunnaGiris@Room
Feature: Medunna room olusturma

  Scenario:Kullanici olusturma
    When kullanici sayfasina gider
    And Register alanına tıklar
    And Kullanıcı bilgilerini girer

Scenario:
    And Signin alanına tıklar
    And Sign in bilgilerini girer

  Scenario:
    And Admimistration alanına tıklar
    And User Manage alanına tıklar
    And Acılan sayfada date alanına tıklayıp sıralar
    And Login olunan satır active yapılır


  Scenario Outline:
    And giris alanına ve sign out linkine tıklar
    And  giris alanına ve sign in linkine tıklar
    And  "<username>" ve "<password>" ile giris yapar
    Then sign in linkine tıklar
    Examples:
      |username  | password |
      |umitg  | Pl1234567. |
