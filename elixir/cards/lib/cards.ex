defmodule Cards do
  @moduledoc """
  Documentation for Cards.
  """

  @doc """
  Hello world.

  ## Examples

      iex> Cards.hello
      :world

  """
  def hello do
    :world
  end
  def create_deck do
    suits = ["Spades","Clubs","Hearts", "Diamonds"]
    values = ["Ace","Two","Three","Four", "Five"]
    for value <- values, suit <- suits do
        "#{value} of #{suit}"
    end
  end

  def shuffle(deck) do
    Enum.shuffle(deck)
  end

  def contains?(deck, card) do
    Enum.member?(deck, card)
  end

  def deal(deck, hand) do
    Enum.split(deck, hand)
  end

  def save(deck, file) do
    binary = :erlang.term_to_binary(deck)
    File.write(file,binary)
  end

  def load(file) do
    case File.read(file) do
        {:ok, binary} -> :erlang.binary_to_term(binary)
        {:error, _} -> "File does not exists"
    end
  end

  def create_hand(hand_size) do
    Cards.create_deck
    |> Cards.shuffle
    |> Cards.deal(hand_size)
  end

end
